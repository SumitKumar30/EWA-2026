package unit_2.thread_communication;

public class Account {
    int amount = 10000; // initial balance

    synchronized void withdraw(int amount)
    {
        System.out.println("Available Balance " + this.amount);
        System.out.println("Going to withdraw." + amount);

        if (this.amount < amount)
        {
            System.out.println("Insufficient Balance waiting for deposit.");
            try
            {
                // releases the lock on this object and waits until another thread invokes notify() or notifyAll() on the same object
                wait();
            } catch (Exception e)
            {
                System.out.println("Interruption Occured");
            }
        }
        // after being notified and reacquiring the lock, the thread continues execution from this point
		this.amount -= amount;
        System.out.println("Detected amount: " + amount);
        System.out.println("Balance amount : " + this.amount);
    }
    synchronized void deposit(int amount)
    {
        System.out.println("Going to deposit " + amount);
        this.amount += amount;
        System.out.println("Deposit completed " + amount);
        System.out.println("Available balance is " + this.amount);
        // notifies a thread that is waiting on this object's monitor to wake up and reacquire the lock and continue execution
        notify();
    } 
}
