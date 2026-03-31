public class BankApplication {
    static void checkTransaction(int amount) throws Exception { // Use throws[cite: 1]
        if (amount < 0) throw new Exception("Invalid amount");
    }

    public static void main(String[] args) {
        try {
            checkTransaction(-50);
            System.out.println("Transaction processed");
        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}