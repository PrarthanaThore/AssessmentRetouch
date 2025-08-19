package Assessment_01;
import java.util.Scanner;

public class BillingItems {

    public static void main(String[] args) {

        //Creating a Scanner object
        Scanner sc = new Scanner(System.in);

        //Taking cost from the user as input.
        System.out.println("Enter the cost of a pencil: ");
        float pencilCost = sc.nextFloat();
        System.out.println("Enter the cost of a pen: ");
        float penCost = sc.nextFloat();
        System.out.println("Enter the cost of an eraser: ");
        float eraserCost = sc.nextFloat();

        //Calculating the total cost
        float totalCost = pencilCost + penCost + eraserCost;

        //Printing the bill of the total items.
        System.out.println("   Item          "+"Price");
        System.out.println("--------------------------");
        System.out.println("   Pencil        "+pencilCost);
        System.out.println("   Pen           "+penCost);
        System.out.println("   Eraser        "+eraserCost);
        System.out.println("--------------------------");
        System.out.println("   Total         "+totalCost);

        System.out.println();

        //After adding 18% GST
        float gst = (totalCost * 18) / 100;
        float totalWithGst = totalCost + gst;
        System.out.println("The total Cost after adding 18% GST: "+totalWithGst);

        //Closing the Scanner object
        sc.close();

    }

}
