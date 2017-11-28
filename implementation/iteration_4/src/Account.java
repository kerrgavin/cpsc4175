/**
 * This program will contain all the data the pertains to a users account inforamation
 *
 * @author Gavin Kerr
 * @author Allie McFarland
 * @version 11/23/2017
 */
 
public class Account {
	private String accountNumber;
	private String accountName;
	private double balance;
	private DebitCard card;
	

	/**
	 * Default constructor for the Account class
	 */
	public Account() {
		this(null, null, 0.0, null);
	}
	
	/**
	 * Custom constructor for the Account class
	 *
	 * @param accountNumber the account number for the user
	 * @param accountName name for the account
	 * @param balance balance for the account
	 * @param card Debit card information for the user
	 */
	public Account(String accountNumber, String accountName, double balance, DebitCard card) {
		setAccountNumber(accountNumber);
		setAccountName(accountName);
		setBalance(balance);
		setCard(card);
	}
	
	/**
	 * Set the value of the account number
	 *
	 * @param accountNumber the account number for the user
	 */
	public void setAccountNumber(String accountNumber) {
		if(accountNumber != null && accountNumber.length() != 9){
			throw new IllegalArgumentException("Inncorrect Account number size");
		} else {
			this.accountNumber = accountNumber;
		}
	}
	
	/**
	 * Returns the account number
	 *
	 * @return the account number
	 */
	public String getAccountNumber() {
		return this.accountNumber;
	}
	
	/**
	 * Sets the value of the account name
	 *
	 * @param accountName the account name for the user
	 */
	public void setAccountName(String accountName) {
		if(accountName != null && accountName.length() > 25){
			throw new IllegalArgumentException("Inncorrect Account name size");
		} else {
			this.accountName = accountName;
		}
	}
	
	/**
	 * Returns the account name
	 *
	 * @return the account name
	 */
	public String getAccountName() {
		return this.accountName;
	}
	
	/**
	 * Sets the value of the account balance
	 *
	 * @param balance the balance for the account
	 */
	public void setBalance(double balance) {
		if(balance < 0 ){
			throw new IllegalArgumentException("Inncorrect Account balance size");
		} else {
			this.balance = balance;
		}
	}
	
	/**
	 * Return the balance for the account
	 *
	 * @return the balance for the account
	 */
	public double getBalance() {
		return this.balance;
	}
	
	/**
	 * Sets the debit card information for the account
	 *
	 * @param card the card information for the account
	 */
	public void setCard(DebitCard card) {
		this.card = card;
	}
	
	/**
	 * Returns the debit card information
	 *
	 * @return the debit card information
	 */
	public DebitCard getCard() {
		return this.card;
	}
	
	/**
	 * Return a formatted string representing the value of the account
	 *
	 * @return a formatted string representing the value of the account
	 */
	public String toString() {
		String o = "Account Number: "+this.accountNumber+"\nAccount Name: "+this.accountName+"\nBalance: "+this.balance;
		return o;
	}
}
