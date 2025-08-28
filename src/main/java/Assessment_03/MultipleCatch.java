package Assessment_03;

public class MultipleCatch {

    public static void main(String[] args) {

        //Case 1: Arithmetic Expression
        try {
            int numerator = 10;
            int denominator = 0;

            int result = numerator / denominator;
            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println("Division by Zero is not allowed");
        }


        //Case 2: NullPointer Exception
        try {
            String str = null;
            System.out.println("Length of String: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("Cannot access the length of a null String");
        }
    }

}