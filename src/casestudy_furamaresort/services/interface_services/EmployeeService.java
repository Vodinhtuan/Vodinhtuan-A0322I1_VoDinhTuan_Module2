package casestudy_furamaresort.services.interface_services;

import casestudy_furamaresort.models.person_inheritance.Employee;

import java.util.List;

public interface EmployeeService extends Service {
    List<Employee> findAll();
    void addEmloyee(Employee employee);
    void updateEmployee(int id, Employee employee);
}
