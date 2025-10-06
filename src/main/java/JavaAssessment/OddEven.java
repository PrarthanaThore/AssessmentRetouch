package JavaAssessment;

public class OddEven {
    private int number = 1;
    private final int MAX = 20;

    // Method to print odd numbers
    public synchronized void printOdd() {
        while (number <= MAX) {
            while (number % 2 == 0) { // Wait when number is even
                try {
                    wait(); // Release lock and wait until notified
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if (number <= MAX) { // Double-check to prevent extra print
                System.out.println("Odd: " + number);
                number++;
                notify(); // Wake up the even thread
            }
        }
    }

    // Method to print even numbers
    public synchronized void printEven() {
        while (number <= MAX) {
            while (number % 2 != 0) { // Wait when number is odd
                try {
                    wait(); // Release lock and wait until notified
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if (number <= MAX) { // Double-check to prevent extra print
                System.out.println("Even: " + number);
                number++;
                notify(); // Wake up the odd thread
            }
        }
    }

    // Main method to start both threads
    public static void main(String[] args) {
        OddEven oe = new OddEven();

        Thread t1 = new Thread(() -> oe.printOdd());
        Thread t2 = new Thread(() -> oe.printEven());

        t1.start();
        t2.start();
    }
}
