package unit_2.thread_communication;

public class Customer extends Thread {
    Account account;
    int amount;
    String transactionType;

    public Customer(Account account, int amount, String transactionType) {
        this.account = account;
        this.amount = amount;
        this.transactionType = transactionType;
    }

    @Override
    public void run() {
        if (transactionType.equals("withdraw")) {
            account.withdraw(amount);
        } else if (transactionType.equals("deposit")) {
            account.deposit(amount);
        }
    }
    
}
