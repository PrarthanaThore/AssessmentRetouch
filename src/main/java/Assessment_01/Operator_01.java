package Assessment_01;

public class Operator_01 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;

        int exp1 = (x * y / x); // 2 *5 = 10    10/2 = 5
        int exp2 = (x *(y / x)); // 5/2 = 2     2 * 2 = 4

        System.out.print(exp1 + " , "); // 5 , 4
        System.out.print(exp2);
    }
}
