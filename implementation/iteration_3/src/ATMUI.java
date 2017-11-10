import java.io.*;
import java.util.*;
public class ATMUI {
	AutomatedTellerMachine atm;
	String userPin;
	int userChoice;
	String cardVal;
	double userAmount;
	Scanner input= new Scanner(System.in);
	Scanner inputI = new Scanner(System.in);
	Scanner inputD = new Scanner(System.in);
	public ATMUI() {
		this(null);
	}
	
	public ATMUI(AutomatedTellerMachine atm) {
		setATM(atm);
		userPin = "";
		userChoice = 0;
		userAmount = 0.0;
		this.process();
	}
	
	public void setATM(AutomatedTellerMachine atm) {
		this.atm = atm;
	}
	
	public AutomatedTellerMachine getATM() {
		return this.atm;
	}
	
	public void process(){
		boolean runProcess = true;
		while (runProcess) {
			cardVal = acceptCard();
			System.out.println(cardVal);
			userPin = acceptPin();
			atm.retrieveAccount(userPin, new DebitCard(cardVal));

			while(atm.getAccount() != null) {
				try{
					userPin = null;
					userChoice = 0;
					userAmount = 0;
					
					userChoice = mainMenu();
					switch(userChoice) {
					case 1:
						accountStatus();
						break;
					case 2:
						withdraw();
						break;
					case 3:
						deposit();
						break;
					case 4:
						exit();
						break;
					case -2:
						exit();
						runProcess = false;
						break;
					default:
						System.out.println("Incorrect input");
						break;
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		
	}
	
public String acceptCard() {
		
		System.out.print("Welcome to ATM. \nPlease insert your debit card. \nCard> ");
		try {
			BufferedReader in = new BufferedReader(new FileReader("data/"+input.nextLine()+".txt"));
			return in.readLine();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	public String acceptPin() {
		
		System.out.print("Welcome to ATM. \nPlease enter your PIN number. \nPin> ");
		return input.nextLine();
	}
	
	public int mainMenu() {
		int choice = -1;
		String c = null;
		try {
			System.out.print("Welcome "+ atm.getAccount().getAccountName() +" - please select your operation:"
					+ "\n\t[1] Account Status \n\t[2] Withdraw \n\t[3] Deposit\n\t[4] Exit\nSelection>");
			c = input.nextLine();
			choice = Integer.parseInt(c);
		} catch(NoSuchElementException e){
				inputI.close();
				choice = -2;
				System.out.println(e.getMessage());
		}
		 catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return choice;
	}
	
	public void accountStatus() {
		System.out.println("\n"+atm+"\n");
		System.out.print("Hit enter to continue>");
		input.nextLine();
	}
	
	public void withdraw() {
		String c = null;
		System.out.print("Enter the amount you would like to withdraw:\nAmount> $");
		try {
			c = input.nextLine();
			userAmount = Double.parseDouble(c);
			System.out.println(userAmount);
			atm.withdraw(userAmount);
			
			System.out.print(String.format("$%1$.2f withdrawn.\n", userAmount));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void deposit() {
		String c = null;
		System.out.print("Enter the amount you would like to deposit:\nAmount> $");
		try {
			c = input.nextLine();
			userAmount = Double.parseDouble(c);
			atm.deposit(userAmount);
			System.out.print(String.format("$%1$.2f deposited.\n", userAmount));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void exit() {
		atm.setAccount(null);
	}
}
