class MusicPlayer extends Thread {
    public void run() {
        System.out.println("Playing song...");
        for (int i = 1; i <= 3; i++) {
            try { Thread.sleep(1000); } catch (Exception e) {} // sleep()[cite: 1]
            System.out.println("Progress " + i);
        }
    }
    public static void main(String[] args) {
        new MusicPlayer().start();
    }
}