
public class ATMRunner {
	public static void main(String args[]) {
		AutomatedTellerMachine atm = new AutomatedTellerMachine();
		ATMUI atmui = new ATMUI(atm);
	}
}
