import java.io.*;
import java.util.*;

/**
 * This class is the interface for users to access the ATM
 *
 * @author Gavin Kerr
 * @author Allie McFarland
 * @version 11/23/2017
 */
public class ATMUI {
	AutomatedTellerMachine atm;
	String userPin;
	int userChoice;
	String cardVal;
	double userAmount;
	Scanner input= new Scanner(System.in);
	Scanner inputI = new Scanner(System.in);
	Scanner inputD = new Scanner(System.in);

	/**
	 * Default constructor for the ATMUI class
	 */
	public ATMUI() {
		this(null);
	}
	
	/**
	 * Custom constructor for the ATMUI class
	 *
	 * @param atm the Automated Teller Machine
	 */
	public ATMUI(AutomatedTellerMachine atm) {
		setATM(atm);
		userPin = "";
		userChoice = 0;
		userAmount = 0.0;
		this.process();
	}
	
	/**
	 * Sets the ATM for the UI
	 *
	 * @param atm the ATM
	 */
	public void setATM(AutomatedTellerMachine atm) {
		this.atm = atm;
	}
	
	/**
	 * Gets the ATM for the UI
	 *
	 * @return the ATM
	 */
	public AutomatedTellerMachine getATM() {
		return this.atm;
	}
	
	/**
	 * Runs the ATM on a continuous loop so that multiple users can access their accounts
	 */
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
	
	/**
	 * Prompts the user to intsert a Debit card and accepts the debit card
	 *
	 * @return the value of the debit card
	 */
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
	
	/**
	 * Prompts the user to key in their PIN number
	 *
	 * @return the PIN value
	 */
	public String acceptPin() {
		
		System.out.print("Welcome to ATM. \nPlease enter your PIN number. \nPin> ");
		return input.nextLine();
	}
	
	/**
	 * Prompts the user to select the type of operation they would like to have completed
	 *
	 * @return user choice
	 */
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
	
	/**
	 * Prints the account status of the selected account
	 */
	public void accountStatus() {
		System.out.println("\n"+atm+"\n");
		System.out.print("Hit enter to continue>");
		input.nextLine();
	}
	
	/**
	 * Prompts the user to enter an amount to withdraw and then withdraws that amount from the current account
	 */
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
	
	/**
	 * Prompts the user for an amount to deposit and then deposits that amount into the current account
	 */
	public void deposit() {
		String c = null;
		System.out.print("Enter the amount you would like to deposit:\nAmount> ");
		try {
			c = input.nextLine();
			userAmount = Double.parseDouble(c);
			atm.deposit(userAmount);
			System.out.print(String.format("$%.2f deposited.\n", userAmount));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * Removes the current account from the ATM's control, allowing a new account to be selected
	 */
	public void exit() {
		atm.setAccount(null);
	}
}
