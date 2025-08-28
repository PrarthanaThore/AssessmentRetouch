package Assessment_03;

public class DivisionByZero {

    public static void main(String[] args) {

        try {
           int numerator = 10;
            int denominator = 0;

            int result = numerator / denominator;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println(" Cannot divide by Zero.");
        }


    }

    }

