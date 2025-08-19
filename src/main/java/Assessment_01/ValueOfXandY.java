package Assessment_01;

public class ValueOfXandY {

    public static void main(String[] args) {

        int a = 63, b = 36;
        boolean x = (a < b) ? false : true;
        int y = (a > b) ? a : b;

        System.out.println(x+" "+y); // false 63
    }
}
