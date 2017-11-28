
public class Test {
	
	public static void main(String args[]) {
		
		DebitCard d = new DebitCard();
		System.out.println(d);
		d = new DebitCard("C89A9EAE5BD19D3DC61D2113");
		System.out.println(d);
		Account a = new Account();

		System.out.println(a);
		a.setAccountName("John");
		System.out.println(a);
		a.setAccountNumber("112453219");
		System.out.println(a);
		a.setBalance(12);
		System.out.println(a);
		a.setCard(d);
		System.out.println(a);
		System.out.println(a.getAccountName());
		System.out.println(a.getAccountNumber());
		System.out.println(a.getBalance());
		System.out.println(a.getCard());
		a = new Account("112453219","John",12,d);
		System.out.println(a);
		System.out.println(a.getAccountName());
		System.out.println(a.getAccountNumber());
		System.out.println(a.getBalance());
		System.out.println(a.getCard());
		
		

		DatabaseReader dr = new DatabaseReader();
		System.out.println(dr.connect());
		a = dr.getAccount("0000",d);
		System.out.println(a);
		dr.updateAccount(a);
		
		AutomatedTellerMachine atm = new AutomatedTellerMachine();
		
		try{
			System.out.println(atm);
		} catch (NullPointerException e) {
			System.out.println("atm is null");
		}
		atm.setAccount(a);
		System.out.println(atm);
		atm.retrieveAccount("0000",d);
		System.out.println(atm);
		atm.deposit(12);
		System.out.println(atm);
		atm.withdraw(12);
		System.out.println(atm);
		System.out.println(atm.getAccount());
		
		
	}
}
