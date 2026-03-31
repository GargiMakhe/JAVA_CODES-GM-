import java.util.Scanner;

public class PasswordMaskingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pass = sc.next();
        
        if (pass.length() > 2) {
            String masked = pass.substring(0, pass.length() - 2).replaceAll(".", "*") 
                            + pass.substring(pass.length() - 2); //[cite: 1]
            System.out.println("Masked: " + masked);
        }
    }
}