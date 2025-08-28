package Assessment_04;
import java.util.ArrayList;

public class CheckElementExists {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList();

        fruits.add("Apple");
        fruits.add("Strawberry");
        fruits.add("Dragon Fruit");
        fruits.add("Kiwi");
        fruits.add("Cherry");

        //Check
        System.out.println("Does the list contain Cherry: "+fruits.contains("Cherry"));
        System.out.println("-------------------------------------");
        System.out.println("Does the list contain Dragon Fruit: "+fruits.contains("Dragon fruit"));
    }

}
