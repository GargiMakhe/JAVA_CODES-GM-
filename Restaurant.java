class Restaurant {
    boolean foodReady = false;
    synchronized void chef() {
        foodReady = true;
        System.out.println("Chef prepared food");
        notify(); // Notify waiter[cite: 1]
    }
    synchronized void waiter() {
        while (!foodReady) {
            try { wait(); } catch (Exception e) {}
        }
        System.out.println("Waiter served food");
    }
    public static void main(String[] args) {
        Restaurant res = new Restaurant();
        new Thread(res::waiter).start();
        new Thread(res::chef).start();
    }
}