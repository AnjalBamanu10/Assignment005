public class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        balance = initialBalance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount + " dollars.");
        System.out.println("New balance is " + balance + " dollars.");
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amount + " dollars.");
            System.out.println("New balance is " + balance + " dollars.");
        } else {
            System.out.println(Thread.currentThread().getName() + " attempted to withdraw " + amount + " dollars but there is insufficient balance.");
        }
    }
}
