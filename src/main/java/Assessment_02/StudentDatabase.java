package Assessment_02;
import java.util.HashMap;

public class StudentDatabase implements DatabaseOperations {
    private HashMap<Integer, Student> students = new HashMap<>();


    @Override
    public void addStudent(Student s) {
        if (!students.containsKey(s.getId())) {
            students.put(s.getId(), s); // store student with ID as key
            System.out.println("Student added successfully!");
        } else {
            System.out.println("Student with this ID already exists.");
        }
    }

    @Override
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        for (Student s : students.values()) {
            s.displayDetails();
            System.out.println("---------------------");
        }
    }

    @Override
    public void updateStudent(int id, String course, double marks) {
        Student s = students.get(id); // fetch student by ID
        if (s != null) {
            s.setCourse(course);
            s.setMarks(marks);
            System.out.println("Student updated successfully!");
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }


    @Override
    public void deleteStudent(int id) {
        if (students.remove(id) != null) {
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
}

