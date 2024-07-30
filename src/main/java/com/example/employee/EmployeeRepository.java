
package com.example.employee;

import com.example.employee.Employee;
import java.util.*;

public interface EmployeeRepository {
    ArrayList<Employee> getallemploye();

    Employee addemployee(Employee addnewemployee);

    Employee getemployeeparticularId(int employeeId);

    Employee updateemployee(int employeeId, Employee getbodyemployee);

    void deleteemployee(int employeeId);
}
// Write your code here