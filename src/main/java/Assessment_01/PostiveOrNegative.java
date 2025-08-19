package Assessment_01;
import java.util.Scanner;

public class PostiveOrNegative {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number you want to check: ");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println(num+ " is a positive Number.");
        } else if(num < 0) {
            System.out.println(num+" is a negative Number.");
        } else {
            System.out.println("The number is Zero.");
        }

        sc.close();
    }
}
