package com.EmployeeAPIs.Employee_API.Service;
import com.EmployeeAPIs.Employee_API.Model.Employee;
import org.springframework.http.ResponseEntity;
import java.util.List;

public interface EmployeeService {

    void createNewEmployee(Employee employee);

    ResponseEntity<List<Employee>> getAllEmployess();

    ResponseEntity<Employee> getByEmployeeId(Long emp_id);

    String deleteEmployeeById(Long emp_id);

    String deleteAllEmployee();

    String updateEmployeeById(long emp_id, Employee employee);

//    List<Employee> getEmpByName(String EmpName);

}
