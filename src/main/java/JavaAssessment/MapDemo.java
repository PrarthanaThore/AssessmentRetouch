package JavaAssessment;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapDemo {

    public static void main(String[] args) throws InterruptedException {

        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> concurrentMap = new ConcurrentHashMap<>();

        //HashMap threads
        Thread h1 = new Thread(() -> addValues(hashMap, "H1"), "HashMap-Thread-1");
        Thread h2 = new Thread(() -> addValues(hashMap, "H2"), "HashMap-Thread-2");

        h1.start();
        h2.start();
        h1.join();
        h2.join();

        System.out.println("HashMap size (may be inconsistent): " + hashMap.size());

        //ConcurrentHashMap threads
        Thread c1 = new Thread(() -> addValues(concurrentMap, "C1"), "ConcurrentMap-Thread-1");
        Thread c2 = new Thread(() -> addValues(concurrentMap, "C2"), "ConcurrentMap-Thread-2");

        c1.start();
        c2.start();
        c1.join();
        c2.join();

        System.out.println("ConcurrentHashMap size: " + concurrentMap.size());
    }

    // Add values to map
    private static void addValues(Map<Integer, String> map, String threadTag) {
        for (int i = 0; i < 1000; i++) {
            map.put(i, threadTag + "-" + i);
        }
    }
}
