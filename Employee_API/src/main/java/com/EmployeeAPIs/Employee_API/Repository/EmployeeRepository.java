package com.EmployeeAPIs.Employee_API.Repository;
import com.EmployeeAPIs.Employee_API.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
 public interface EmployeeRepository extends JpaRepository<Employee,Long> {

// List<Employee> findByEmpName(String EmpName);
}
