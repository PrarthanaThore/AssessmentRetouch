package Assessment_01;

class Shape {

    public void draw(){
        System.out.println("Its a shape");

    }
}

class Circle extends Shape {
     @Override
    public void draw(){
        System.out.println("The shape is a Circle");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("The shape is a square");

    }
}

public class Polymorphism {

    public static void main(String[] args) {
        Shape s1 = new Circle();
        s1.draw();

        s1 = new Square();
        s1.draw();







    }



}
