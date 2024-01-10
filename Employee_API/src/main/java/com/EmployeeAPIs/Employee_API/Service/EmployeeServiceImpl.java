package com.EmployeeAPIs.Employee_API.Service;

import com.EmployeeAPIs.Employee_API.Model.Employee;
import com.EmployeeAPIs.Employee_API.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;


    public void createNewEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public ResponseEntity<List<Employee>> getAllEmployess() {
        try {
            return new ResponseEntity<>(employeeRepository.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.NOT_FOUND);
    }


    public ResponseEntity<Employee> getByEmployeeId(Long emp_id) {
        Employee employee = employeeRepository.findById(emp_id).orElse(null);
        if (employee != null) {
            return new ResponseEntity<>(employee, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public String deleteEmployeeById(Long emp_id) {
        employeeRepository.deleteById(emp_id);
        return "Employee Deleted Succesfully";
    }

    public String deleteAllEmployee() {
        employeeRepository.deleteAll();
        return "Employee Data Deleted";
    }

    public String updateEmployeeById(long emp_id, Employee employee) {
        Optional<Employee> emp = employeeRepository.findById(emp_id);
        if (emp.isPresent()) {
            Employee existEmp = emp.get();
            existEmp.setEmpName(employee.getEmpName());
            existEmp.setEmp_salary(employee.getEmp_salary());
            existEmp.setEmp_age(employee.getEmp_age());
            existEmp.setEmp_city(employee.getEmp_city());
            employeeRepository.save(existEmp);
            return "Employee Details against Id :- " + emp_id + " Updated";


        } else {
            return "Employee Id doesn't Exist for EmployeeId :- " + emp_id;
        }
    }
//
//    public List<Employee> getEmpByName(String EmpName) {
//    return employeeRepository.findByEmpName(EmpName);
//    }
}
