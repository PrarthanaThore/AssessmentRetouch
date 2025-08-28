package Assessment_03;

public class NestedTryBlock {

    public static void main(String[] args) {

        try {
            System.out.println("Outer Try Block");

            // Inner Try block 1: Arithmetic Exception
            try{
                int num = 10;
                int den = 0;
                int result = num / den;   // ArithmeticException
                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
                System.out.println("Caught in inner catch: Division by zero");
            }


            try {
                // Inner try block 2: Array Index Out of Bounds
                int[] arr = {1, 2, 3};
                System.out.println(arr[5]); // ArrayIndexOutOfBoundsException

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught in inner catch: Invalid array index");
            }

        } catch (Exception e) {
            // This will handle any exception not caught in inner try blocks
            System.out.println("Caught in outer catch: " + e);
        }

        System.out.println("Program continues after outer try-catch.");
    }
}
