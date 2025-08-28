package Assessment_04;
import org.w3c.dom.ls.LSOutput;

import java.util.LinkedList;

public class AddRemove {

    public static void main(String[] args) {

        LinkedList<Integer> l = new LinkedList<>();
        l.add(12);
        l.add(23);
        l.add(78);
        l.add(64);
        l.add(97);

        System.out.println("Original List of elements: " + l);

        //Remove the first element
        l.removeFirst();

        //Remove the last element
        l.removeLast();

        //Print list after remove operation
        System.out.println("List after Remove operation: "+l);

    }
}
