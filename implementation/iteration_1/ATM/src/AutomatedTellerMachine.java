
public class AutomatedTellerMachine {
	
	Account acc;
	DatabaseReader dbr;
	public AutomatedTellerMachine() {
		this(null);
	}
	
	public AutomatedTellerMachine(Account acc){
		setAccount(acc);
		dbr = new DatabaseReader();
	}
	
	public void setAccount(Account acc) {
		this.acc = acc;
	}
	
	public Account getAccount(){
		return this.acc;
	}
	
	public void retrieveAccount(String pin) {
		
		acc = dbr.getAccount(pin);
		if(acc == null) {
			System.out.println("Non-existant PIN");
		}
	}
	
	public void deposit(double amount) {
		acc.setBalance(acc.getBalance()+amount);
		dbr.updateAccount(acc);
	}
	
	public double withdraw(double amount) {
		if(amount < acc.getBalance()) {
			acc.setBalance(acc.getBalance()-amount);
		} else {
			throw new IllegalArgumentException("Inncorrect Account balance size");
		}
		dbr.updateAccount(acc);
		return amount;
	}
	
	public String toString() {
		return acc.toString();
	}
}
