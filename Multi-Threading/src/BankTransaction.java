public class BankTransaction implements Runnable {
    private BankAccount bankAccount;
    private boolean deposit;

    public BankTransaction(BankAccount bankAccount, boolean deposit) {
        this.bankAccount = bankAccount;
        this.deposit = deposit;
    }

    public void run() {
        if (deposit) {
            bankAccount.deposit(100);
        } else {
            bankAccount.withdraw(50);
        }
    }
}
