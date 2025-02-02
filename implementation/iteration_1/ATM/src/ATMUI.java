import java.util.*;
public class ATMUI {
	AutomatedTellerMachine atm;
	String userPin;
	int userChoice;
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
		while (true) {
			userPin = loginMenu();
			atm.retrieveAccount(userPin);
			while(atm.getAccount() != null) {
				try{
					userPin = null;
					userChoice = 0;
					userAmount = 0;
					
					//userChoice = mainMenu();
					switch(mainMenu()) {
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
	
	public String loginMenu() {
		
		System.out.print("Welcome to ATM. \nPlease enter your PIN number. \nPin> ");
		return input.nextLine();
	}
	
	public int mainMenu() {
		int choice = -1;
		try {
			inputI = new Scanner(System.in);
			System.out.print("Welcome "+ atm.getAccount().getAccountName() +" - please select your operation:"
					+ "\n\t[1] Account Status \n\t[2] Withdraw \n\t[3] Deposit\n\t[4] Exit\nSelection>");
			choice = inputI.nextInt();
		} catch(Exception e){
				inputI.close();
				System.out.println(e.getMessage());
		}
		
		return choice;
	}
	
	public void accountStatus() {
		System.out.println("\n"+atm+"\n");
		System.out.print("Hit enter to continue>");
		input.next();
	}
	
	public void withdraw() {
		System.out.print("Enter the amount you would like to withdraw:\nAmount> $");
		try {
			inputD = new Scanner(System.in);
			userAmount = inputD.nextDouble();
			System.out.println(userAmount);
			atm.withdraw(userAmount);
			
			System.out.print(String.format("$%1$.2f withdrawn.\n", userAmount));
		} catch (Exception e) {
			inputD.reset();
			System.out.println(e.getMessage());
		}
	}
	
	public void deposit() {
		System.out.print("Enter the amount you would like to deposit:\nAmount> $");
		try {
			inputD = new Scanner(System.in);
			userAmount = inputD.nextDouble();
			atm.deposit(userAmount);
			System.out.print(String.format("$%1$.2f deposited.\n", userAmount));
		} catch (Exception e) {
			inputD.reset();
			System.out.println(e.getMessage());
		}
	}
	
	public void exit() {
		atm.setAccount(null);
	}
}
