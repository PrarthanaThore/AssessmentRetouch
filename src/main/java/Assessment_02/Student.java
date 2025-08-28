package Assessment_02;

public class Student extends Person{

    private int id;
    private String course;
    private double marks;

    //Constructor
    public Student(String name, int age,int id, String course, double marks){
        super(name, age);
        this.id = id;
        this.course = course;
        this.marks = marks;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Overriding displayDetails() from Person
    @Override
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + getName() +
                ", Age: " + getAge() + ", Course: " + course + ", Marks: " + marks +
                ", Result: " + calculateResult());
    }


    // Calculate result based on marks
    public String calculateResult() {
        if (marks >= 85) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 55) return "C";
        else return "Fail";
    }

    // Overloaded method to include bonus marks
    public String calculateResult(double bonusMarks) {
        double total = marks + bonusMarks;
        if (total >= 85) return "A";
        else if (total >= 70) return "B";
        else if (total >= 55) return "C";
        else return "Fail";
    }

}
