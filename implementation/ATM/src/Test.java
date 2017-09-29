
public class Test {
	
	public static void main(String args[]) {
		Account a = new Account();
		try {
			System.out.println(a);
			a.setAccountName("John");
			System.out.println(a);
			a.setAccountNumber("112453219");
			System.out.println(a);
			a.setBalance(12);
			System.out.println(a);
			System.out.println(a.getAccountName());
			System.out.println(a.getAccountNumber());
			System.out.println(a.getBalance());
		} catch (NullPointerException e ){
			System.out.println(e.getMessage());
		}
		a = new Account("John", "112453219",12);
		System.out.println(a);
		System.out.println(a.getAccountName());
		System.out.println(a.getAccountNumber());
		System.out.println(a.getBalance());
		
		DatabaseReader dr = new DatabaseReader();
		System.out.println(dr.connect());
		a = dr.getAccount("0000");
		System.out.println(a);
		dr.updateAccount(a);
		
		AutomatedTellerMachine atm = new AutomatedTellerMachine();
		
		System.out.println(atm);
		atm.setAccount(a);
		System.out.println(atm);
		atm.retrieveAccount("0000");
		System.out.println(atm);
		atm.deposit(12);
		System.out.println(atm);
		atm.withdraw(12);
		System.out.println(atm);
		System.out.println(atm.getAccount());
		
		
	}
}
