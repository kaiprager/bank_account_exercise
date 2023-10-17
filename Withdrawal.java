package thread_synchronization;

public class Withdrawal extends Thread {
	
	private BankAccount account;
	
	public Withdrawal(BankAccount account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		for(int n = 0; n < 5; n++) {
			account.withdraw(50);
		}
	}

}
