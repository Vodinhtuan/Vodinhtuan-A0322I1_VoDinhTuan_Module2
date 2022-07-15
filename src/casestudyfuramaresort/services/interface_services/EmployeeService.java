package casestudyfuramaresort.services.interface_services;

import casestudyfuramaresort.models.person_inheritance.Employee;

import java.util.List;

public interface EmployeeService extends Service {
    List<Employee> findAll();
    void addEmloyee(Employee employee);
    void updateEmployee(int id, Employee employee);
}
