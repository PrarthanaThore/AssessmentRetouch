package JavaAssessment;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {

    public static void main(String[] args) {

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        // Producer thread
        Thread producer = new Thread(() -> {
            int value = 1;
            try {
                while (true) {
                    System.out.println("Produced: " + value);
                    queue.put(value); // blocks if queue is full
                    value++;
                    Thread.sleep(500); // simulate production time
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    int val = queue.take(); // blocks if queue is empty
                    System.out.println("Consumed: " + val);
                    Thread.sleep(800); // simulate consumption time
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start threads
        producer.start();
        consumer.start();
    }
}
