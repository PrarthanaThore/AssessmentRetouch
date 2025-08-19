package Assessment_01;
import java.util.Scanner;

public class SumOfEvenAndOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many integers you want to read : ");
         int n = sc.nextInt();

         int evenSum = 0;
         int oddSum = 0;

        for(int i=1;i<=n;i++){
            System.out.println("Enter Integer "+i+" :");
            int num = sc.nextInt();

            //Enters the if loop
            if(num % 2==0 ){
                evenSum = evenSum + num;
            } else {
                oddSum = oddSum + num;
            }
        }

        //Prints the sum of Even and Odd Numbers.
        System.out.println("Sum of even Number: "+evenSum);
        System.out.println("Sum of odd Numbers: "+oddSum);

        //Closing the Scanner
        sc.close();


    }
}
