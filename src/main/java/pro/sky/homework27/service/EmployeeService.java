package pro.sky.homework27.service;

import pro.sky.homework27.employee.Employee;

import java.util.Collection;

public interface EmployeeService {
    public Employee addEmployee(String firstName, String lastName);

    public Employee removeEmployee(String firstName, String lastName);

    public Employee findEmployee(String firstName, String lastName);


    Collection<Employee> getAllEmployees();
}
