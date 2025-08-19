package Assessment_01;

public class Student {

    String name;
    int rollNo;
    double marks;

    Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public void display(){
        System.out.println("Name: "+name+" RollNo: "+rollNo+" Marks: "+marks);
        System.out.println();
    }

    public static void main(String[] args) {
        Student s1 = new Student("Prarthana",20,86.69);
        Student s2 = new Student("Yashita",23,98.5);

        s1.display();
        s2.display();
    }
}
