package Assessment_01;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        //Creating Scanner class
        Scanner sc = new Scanner(System.in);
        //Taking input from the user.
        System.out.println("Enter the number you want to find Factorial for: ");
        int num = sc.nextInt();


        //if condition to avoid negative numbers.
        if(num < 0){
            System.out.println("Factorial is not defined for negative Numbers.");
        } else{
            long fact = 1;

            for(int i = 1;i <= num; i++){
                fact = fact * i;
                //System.out.println("Step " + i + ": " + fact);
            }

            System.out.println("The factorial of "+num+" is "+fact+".");

        }
        sc.close();

    }
}
