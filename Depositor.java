package thread_synchronization;

public class Depositor extends Thread {
	
	private BankAccount account;
	
	public Depositor(BankAccount account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		for(int n = 0; n < 5; n++) {
			account.deposit(100);
		}
	}

}
