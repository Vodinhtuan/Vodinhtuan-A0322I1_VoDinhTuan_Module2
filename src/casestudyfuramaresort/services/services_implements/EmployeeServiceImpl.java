package casestudyfuramaresort.services.services_implements;

import casestudyfuramaresort.models.person_inheritance.Employee;
import casestudyfuramaresort.repository.EmployeeRepository;
import casestudyfuramaresort.repository.EmployeeRepositoryIplm;
import casestudyfuramaresort.services.interface_services.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository repository = new EmployeeRepositoryIplm();
    @Override
    public List<Employee> findAll() {
        return ;
    }

    @Override
    public void addEmloyee(Employee employee) {

    }

    @Override
    public void updateEmployee(int id, Employee employee) {

    }
}
