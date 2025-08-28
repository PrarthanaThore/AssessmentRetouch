package Assessment_02;

public class Person {

    private String name;
    private int age;

    //Constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

      //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid Age! Enter Valid age");
            this.age = 1;
        }
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

}
