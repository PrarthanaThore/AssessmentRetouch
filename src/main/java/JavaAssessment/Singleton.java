package JavaAssessment;

public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
        System.out.println("Singleton instance created");
    }

    // public method to provide access to the single instance
    public static Singleton getInstance() {
        if (instance == null) { // first check (no locking)
            synchronized (Singleton.class) { // lock the class
                if (instance == null) { // second check (with lock)
                    instance = new Singleton(); // create instance
                }
            }
        }
        return instance; // return the singleton instance
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    public static void main(String[] args) {
        // Create two threads to test thread safety
        Thread t1 = new Thread(() -> {
            Singleton s1 = Singleton.getInstance();
            s1.showMessage();
        });

        Thread t2 = new Thread(() -> {
            Singleton s2 = Singleton.getInstance();
            s2.showMessage();
        });

        t1.start();
        t2.start();
    }
}
