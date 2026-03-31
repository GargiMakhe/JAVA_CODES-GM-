class BankAccount {
    int balance = 1000;
    void withdraw(int amt) {
        synchronized(this) { // Synchronized block[cite: 1]
            if(balance >= amt) {
                balance -= amt;
                System.out.println("Deducted: " + amt + " | New Balance: " + balance);
            }
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        new Thread(() -> acc.withdraw(500)).start();
        new Thread(() -> acc.withdraw(300)).start();
    }
}