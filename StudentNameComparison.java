import java.util.Scanner;

public class StudentNameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String name1 = sc.next();
        System.out.print("Enter second name: ");
        String name2 = sc.next();

        System.out.println("Case-sensitive: " + (name1.equals(name2) ? "Match" : "No Match"));
        System.out.println("Case-insensitive: " + (name1.equalsIgnoreCase(name2) ? "Match" : "No Match")); //[cite: 1]
    }
}