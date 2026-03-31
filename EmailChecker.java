import java.util.Scanner;

public class EmailChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = sc.next();
        
        if (email.contains("@gmail.com")) { // Check for specific domain[cite: 1]
            System.out.println("Valid Gmail Address");
        } else {
            System.out.println("Invalid Email");
        }
    }
}