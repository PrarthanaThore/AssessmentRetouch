package Assessment_01;

public class Operator_02 {

    public static void main(String[] args) {

        int x = 200;
        int y = 50;
        int z = 100;

        if(x > y && y > z){ //false, so doesnt print anything.
            System.out.println("Hello");
        }
        if(z > y && z < x){ //true, hence prints Java.
            System.out.println("Java");
        }
        if((y+200) < x && (y+150) < z){ //false,so doesnt print anything.
            System.out.println("Hello Java");
        }
    }
}

//Here each if block is independent, hence all the if blocks will get executed.
//But in else if blocks, the blocks will execute until one if is true and execution stops.
