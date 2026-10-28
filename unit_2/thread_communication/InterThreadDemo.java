package unit_2.thread_communication;

public class InterThreadDemo {
    public static void main(String[] args) {
        Account account = new Account();

        Customer customer1 = new Customer(account, 15000, "withdraw");
        Customer customer2 = new Customer(account, 10000, "deposit");

        customer1.start();
        customer2.start();
    }
}
