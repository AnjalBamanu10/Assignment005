public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(0);
        Thread t1 = new Thread(new BankTransaction(account, true), "Thread 1");
        Thread t2 = new Thread(new BankTransaction(account, true), "Thread 2");
        Thread t3 = new Thread(new BankTransaction(account, false), "Thread 3");
        Thread t4 = new Thread(new BankTransaction(account, false), "Thread 4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
