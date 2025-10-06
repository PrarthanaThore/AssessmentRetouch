package JavaAssessment.Controller;

import JavaAssessment.Model.EmployeeModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/employees")
    public List<EmployeeModel> getEmployees() {
        List<EmployeeModel> employees = new ArrayList<>();

        // Sample employee data
        employees.add(new EmployeeModel(101, "John", 50000));
        employees.add(new EmployeeModel(102, "Alice", 75000));
        employees.add(new EmployeeModel(103, "Bob", 60000));
        employees.add(new EmployeeModel(104, "Daisy", 45000));

        return employees;
    }
}
