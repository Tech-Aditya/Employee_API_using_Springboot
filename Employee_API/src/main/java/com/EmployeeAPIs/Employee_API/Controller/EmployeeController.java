package com.EmployeeAPIs.Employee_API.Controller;
import com.EmployeeAPIs.Employee_API.Model.Employee;
import com.EmployeeAPIs.Employee_API.Service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeService;

    @GetMapping("/employee")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return employeeService.getAllEmployess();
    }

    @GetMapping("{emp_id}")
    public ResponseEntity<Employee> getByEmployeeId(@PathVariable Long emp_id) {
        return employeeService.getByEmployeeId(emp_id);
    }


    @PostMapping("/employee")
    public String createNewEmployee(@RequestBody Employee employee) {
        employeeService.createNewEmployee(employee);
        return "Employee Created in Database";
    }

    @DeleteMapping("/employee/{emp_id}")
    public String deleteEmployeeById(@PathVariable Long emp_id) {
        return employeeService.deleteEmployeeById(emp_id);
    }

    @DeleteMapping("/allEmployee")
    public String deleteAllEmployee() {
        return employeeService.deleteAllEmployee();

    }

//    @GetMapping("/byCity/{emp_city}")
//    public List<Employee> getByCity(@PathVariable String emp_city) {
//        return employeeService.getByCity(emp_city);
//    }
//
//    @GetMapping("/byName/{EmpName}")
//    public List<Employee> getEmpByName(@PathVariable String EmpName) {
//        return employeeService.getEmpByName(EmpName);
//    }

    @PutMapping("/employee/{empId}")
    public String updateEmployeeById(@PathVariable long empId, @RequestBody Employee employee) {
        return employeeService.updateEmployeeById(empId, employee);
    }


}
