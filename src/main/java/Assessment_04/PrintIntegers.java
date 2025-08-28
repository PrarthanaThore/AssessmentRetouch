package Assessment_04;

import java.util.ArrayList;

public class PrintIntegers {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(50);
        al.add(67);
        al.add(58);
        al.add(33);
        al.add(32);
        al.add(0);
        al.add(32);
        al.add(100);

        for(Integer i : al){
            System.out.print(i+ " ");
        }

    }
}
