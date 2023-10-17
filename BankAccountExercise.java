package thread_synchronization;

public class BankAccountExercise {

	public static void main(String[] args) {

		BankAccount account = new BankAccount(0);
		Depositor depositor = new Depositor(account);
		Withdrawal withdrawal = new Withdrawal(account);
		
		depositor.start();
		withdrawal.start();
		
		try {
			depositor.join();
			withdrawal.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		int newBalance = account.getBalance();
		
		System.out.println("Your balance is: €" + newBalance);
	}

}
