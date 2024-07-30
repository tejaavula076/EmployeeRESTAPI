/*
 * You can use the following import statements
 * 
 * import org.springframework.web.server.ResponseStatusException;
 * import org.springframework.http.HttpStatus;
 * 
 */

package com.example.employee;

import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import com.example.employee.Employee;
import com.example.employee.EmployeeRepository;

import java.util.*;

// Do not modify the below code

public class EmployeeService implements EmployeeRepository {

  private static HashMap<Integer, Employee> employeeList = new HashMap<>();

  public EmployeeService() {
    employeeList.put(1, new Employee(1, "John Doe", "johndoe@example.com", "Marketing"));
    employeeList.put(2, new Employee(2, "Jane Smith", "janesmith@example.com", "Human Resources"));
    employeeList.put(3, new Employee(3, "Bob Johnson", "bjohnson@example.com", "Sales"));
    employeeList.put(4, new Employee(4, "Alice Lee", "alee@example.com", "IT"));
    employeeList.put(5, new Employee(5, "Mike Brown", "mbrown@example.com", "Finance"));
    employeeList.put(6, new Employee(6, "Sara Lee", "slee@example.com", "Operations"));

  }

  // Do not modify the above code

  // Write your code here
  int incrementvalue = 7;

  @Override
  public ArrayList<Employee> getallemploye() {
    Collection<Employee> listget = employeeList.values();
    ArrayList<Employee> newlist = new ArrayList<>(listget);
    return newlist;

  }

  @Override
  public Employee addemployee(Employee addnewemployee) {
    addnewemployee.setemployeeId(incrementvalue);
    employeeList.put(incrementvalue, addnewemployee);
    incrementvalue += 1;
    return addnewemployee;
  }

  @Override
  public Employee getemployeeparticularId(int employeeId) {
    Employee onef = employeeList.get(employeeId);
    if (onef == null) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
    return onef;
  }

  @Override
  public Employee updateemployee(int employeeId, Employee getbodyemployee) {
    Employee onefirst = employeeList.get(employeeId);
    if (onefirst == null) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
    if (getbodyemployee.getemployeeId() != 0) {
      onefirst.setemployeeId(getbodyemployee.getemployeeId());
    }
    if (getbodyemployee.getemployeeName() != null) {
      onefirst.setemployeeName(getbodyemployee.getemployeeName());
    }
    if (getbodyemployee.getemail() != null) {
      onefirst.setemail(getbodyemployee.getemail());
    }
    if (getbodyemployee.getdepartment() != null) {
      onefirst.setdepartment(getbodyemployee.getdepartment());
    }
    return onefirst;
  }

  @Override
  public void deleteemployee(int employeeId) {
    Employee kl = employeeList.get(employeeId);
    if (kl == null) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    } else {
      employeeList.remove(employeeId);
      throw new ResponseStatusException(HttpStatus.NO_CONTENT);
    }
  }

}
