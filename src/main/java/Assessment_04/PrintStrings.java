package Assessment_04;
import java.util.LinkedList;

public class PrintStrings {

    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("Apple");
        l.add("Papaya");
        l.add("Pineapple");
        l.add("Orange");
        l.add("Cashew");

        System.out.println("The third element is : "+l.get(2));

    }
}
