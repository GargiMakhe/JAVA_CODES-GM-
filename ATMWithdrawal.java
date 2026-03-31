import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000;
        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        try {
            if (amount > balance) throw new Exception("Insufficient Balance"); // Manual throw[cite: 1]
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}