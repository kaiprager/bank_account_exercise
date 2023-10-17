package thread_synchronization;

public class BankAccount {

    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public int getBalance() {
        return balance;
    }

    public synchronized void deposit(int depositMoney) {
            balance += depositMoney;
    }

    public synchronized void withdraw(int withdrawMoney) {
    	
            if (balance >= withdrawMoney) {
                balance -= withdrawMoney;
            } else {
                System.out.println("Insufficient funds.");
            }
    }
}