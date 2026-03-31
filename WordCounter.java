import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        
        StringTokenizer st = new StringTokenizer(str); // Use StringTokenizer[cite: 1]
        System.out.println("Total words: " + st.countTokens());
    }
}