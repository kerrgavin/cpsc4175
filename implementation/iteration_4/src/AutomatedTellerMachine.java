/**
 * This class controls the operations of an ATM
 *
 * @author Gavin Kerr
 * @author Allie McFarland
 * @version 11/23/2017
 */ public class AutomatedTellerMachine {
	
	Account acc;
	DatabaseReader dbr;
	/**
	 * Default constructor for the AutomatedTellerMachine class
	 */
	public AutomatedTellerMachine() {
		this(null);
	}
	
	/**
	 * Custom constructor for the AutomatedTellerMachine class
	 *
	 * @param acc the account information
	 */
	public AutomatedTellerMachine(Account acc){
		setAccount(acc);
		dbr = new DatabaseReader();
	}
	
	/**
	 * Sets the account information for the ATM to access
	 *
	 * @param acc the account information
	 */
	public void setAccount(Account acc) {
		this.acc = acc;
	}
	
	/**
	 * Returns the account information
	 *
	 * @return the account information
	 */
	public Account getAccount(){
		return this.acc;
	}
	
	/**
	 * Retrieves the account information from the database
	 *
	 * @param pin the Pin number
	 * @param card the debit card information
	 */
	public void retrieveAccount(String pin, DebitCard card) {
		
		acc = dbr.getAccount(pin, card);
		if(acc == null) {
			System.out.println("Non-existant PIN");
		}
	}
	
	/**
	 * Deposits money into the current account
	 *
	 * @param amount the amount to be depositted
	 */
	public void deposit(double amount) {
		acc.setBalance(acc.getBalance()+amount);
		dbr.updateAccount(acc);
	}
	
	/**
	 * Withdraws money from the current account
	 *
	 * @param amount the amount to be withdrawn
	 * @return the amount withdrawn
	 */
	public double withdraw(double amount) {
		if(amount < acc.getBalance()) {
			acc.setBalance(acc.getBalance()-amount);
		} else {
			throw new IllegalArgumentException("Inncorrect Account balance size");
		}
		dbr.updateAccount(acc);
		return amount;
	}
	
	/**
	 * Formats and returns the value of the ATM
	 *
	 * @return the formatted value of the ATM
	 */
	public String toString() {
		System.out.println(acc);
		if (acc != null) {
			return acc.toString();
		}
		return null;
	}
}
