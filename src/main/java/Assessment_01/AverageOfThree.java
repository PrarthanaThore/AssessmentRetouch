package Assessment_01;
import java.util.Scanner;

public class AverageOfThree {

    public static void main(String[] args) {

        //Creating Scanner object for input
        Scanner sc = new Scanner(System.in);

        //Taking 3 inputs a,b and c from the user.
        System.out.println("Enter first Number: ");
        double a = sc.nextDouble();
        System.out.println("Enter second Number: ");
        double b = sc.nextDouble();
        System.out.println("Enter third Number: ");
        double c = sc.nextDouble();

        //Calculating the average of the 3 numbers
        double average = (a+b+c)/3;

        //Printing the average of the three numbers.
        System.out.println("The average is: "+average);

        //Closing the Scanner
        sc.close();

    }
}
