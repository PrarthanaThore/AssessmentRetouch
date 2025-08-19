package Assessment_01;

public class Operator_03 {

    public static void main(String[] args) {

        int x = 10;
        int y = 5;

        int exp1 = (y * (x / y + x / y)); // 20
        int exp2 = (y * x / y + y * x / y); // 20

        System.out.println(exp1); //20
        System.out.println(exp2); //20

    }
}
