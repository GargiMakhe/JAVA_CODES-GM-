public class ChatApplication {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println("Sending message..."));
        Thread t2 = new Thread(() -> System.out.println("Receiving message..."));
        
        System.out.println("Status: NEW");
        t1.start(); //[cite: 1]
        t2.start();
        System.out.println("Status: RUNNABLE/TERMINATED");
    }
}