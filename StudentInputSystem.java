import java.util.*;

public class StudentInputSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            System.out.println("Student age is: " + age);
        } catch (InputMismatchException | ArithmeticException e) { // Multiple catch[cite: 1]
            System.out.println("Invalid input");
        }
    }
}