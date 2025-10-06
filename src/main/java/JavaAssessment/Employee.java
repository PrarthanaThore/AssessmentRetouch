package JavaAssessment;

public final class Employee {

    private final int id;
    private final String name;
    private final double salary;

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
       return "Employee Id: "+id+" Name: "+name+" Salary: "+salary;
    }

    public static void main(String[] args) {

        Employee emp2 = new Employee(102, "Twinkle", 60000.0);
        System.out.println(emp2);

    }

}
