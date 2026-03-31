public class TextEditorBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World"); // Append
        sb.insert(5, " Java"); // Insert[cite: 1]
        sb.reverse(); // Reverse
        System.out.println("Result: " + sb);
    }
}