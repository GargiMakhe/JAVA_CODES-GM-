import java.util.Scanner;

public class FileExtensionExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter filename (e.g., report.pdf): ");
        String filename = sc.next();
        
        int index = filename.lastIndexOf(".");
        if (index != -1) {
            System.out.println("Extension: " + filename.substring(index + 1)); //[cite: 1]
        }
    }
}