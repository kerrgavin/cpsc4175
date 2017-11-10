
public class Account {
	private String accountNumber;
	private String accountName;
	private double balance;
	private DebitCard card;
	
	public Account() {
		this(null, null, 0.0, null);
	}
	
	public Account(String accountNumber, String accountName, double balance, DebitCard card) {
		setAccountNumber(accountNumber);
		setAccountName(accountName);
		setBalance(balance);
		setCard(card);
	}
	
	public void setAccountNumber(String accountNumber) {
		if(accountNumber != null && accountNumber.length() != 9){
			throw new IllegalArgumentException("Inncorrect Account number size");
		} else {
			this.accountNumber = accountNumber;
		}
	}
	
	public String getAccountNumber() {
		return this.accountNumber;
	}
	
	public void setAccountName(String accountName) {
		if(accountName != null && accountName.length() > 25){
			throw new IllegalArgumentException("Inncorrect Account name size");
		} else {
			this.accountName = accountName;
		}
	}
	
	public String getAccountName() {
		return this.accountName;
	}
	
	public void setBalance(double balance) {
		if(balance < 0 ){
			throw new IllegalArgumentException("Inncorrect Account balance size");
		} else {
			this.balance = balance;
		}
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setCard(DebitCard card) {
		this.card = card;
	}
	
	public DebitCard getCard() {
		return this.card;
	}
	
	public String toString() {
		String o = "Account Number: "+this.accountNumber+"\nAccount Name: "+this.accountName+"\nBalance: "+this.balance;
		return o;
	}
}
