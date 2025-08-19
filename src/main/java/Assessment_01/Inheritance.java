package Assessment_01;

class Animal {

    public void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    public void sound(){
        System.out.println("Dog Barks!");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();



    }

}
