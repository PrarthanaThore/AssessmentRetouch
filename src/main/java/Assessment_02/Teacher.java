package Assessment_02;

public class Teacher extends Person{


    private double salary;
    private String subject;

    //Constructor
    public Teacher(String name, int age, double salary, String subject){
        super(name,age);
       this.salary = salary;
        this.subject = subject;
    }
     //Getters and Setters
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Overriding displayDetails for presentation
    @Override
    public void displayDetails() {
        System.out.println("Teacher -> Name: " + getName() + ", Age: " + getAge() +
                ", Salary: " + salary + ", Subject: " + subject);
    }

}
