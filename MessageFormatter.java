import java.util.Scanner;

public class MessageFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First Name: ");
        String first = sc.next();
        System.out.print("Last Name: ");
        String last = sc.next();

        String fullName = first + " " + last; // Concatenation[cite: 1]
        System.out.println("Full Name: " + fullName);
    }
}