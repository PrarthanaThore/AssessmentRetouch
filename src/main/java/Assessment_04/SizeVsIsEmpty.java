package Assessment_04;
import java.util.ArrayList;

public class SizeVsIsEmpty {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        //Before Adding Elements
        System.out.println("Initial Size: "+al.size());
        System.out.println("Is the list Empty: "+al.isEmpty());

        System.out.println("-------------------------------------");

        al.add("Banana");
        al.add("Pomegranate");


        //After Adding Elements
        System.out.println("Size After Adding Elements: "+al.size());
        System.out.println("Is the list empty after addition: "+al.isEmpty());

    }
}
