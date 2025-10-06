package Assessment_03;

public class FinallyBlock {

    public static void main(String[] args) {

        // Case 1: Exception occurs
        try {
            System.out.println("Case 1: Exception occurs");
            int num = 10;
            int den = 0;
            int result = num / den;  // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Finally block executed (Case 1)");
        }

        System.out.println("-------------------------------------");

        // Case 2: No exception
        try {
            System.out.println("Case 2: No exception");
            int num = 10;
            int den = 2;
            int result = num / den;  // No exception here
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Finally block executed (Case 2)");
        }

        System.out.println("End of program");
    }
}

