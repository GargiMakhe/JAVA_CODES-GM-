import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        
        String cleaned = username.trim().toLowerCase(); // Remove spaces and lowercase[cite: 1]
        System.out.println("Cleaned username: " + cleaned);
    }
}