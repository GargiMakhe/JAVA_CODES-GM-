class Downloader implements Runnable {
    String file;
    Downloader(String f) { this.file = f; }
    public void run() {
        System.out.println("Downloading " + file + "..."); //[cite: 1]
    }
}

public class DownloadManager {
    public static void main(String[] args) {
        new Thread(new Downloader("File1.zip")).start();
        new Thread(new Downloader("File2.zip")).start();
    }
}