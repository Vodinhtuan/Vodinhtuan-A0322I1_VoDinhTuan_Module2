package casestudyfuramaresort.controllers;

import casestudyfuramaresort.models.person_inheritance.Employee;
import casestudyfuramaresort.repository.EmployeeRepositoryIplm;
import casestudyfuramaresort.services.interface_services.EmployeeService;
import casestudyfuramaresort.services.services_implements.EmployeeServiceImpl;

import java.util.List;

public class FacilityController {
    private EmployeeService employeeService = new EmployeeServiceImpl();
    private static List<Employee> employeeList = (List<Employee>) new EmployeeRepositoryIplm();
    public void displayAllEmployee(){
    }
}
