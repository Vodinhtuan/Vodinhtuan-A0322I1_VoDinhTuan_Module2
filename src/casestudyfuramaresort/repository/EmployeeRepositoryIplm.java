package casestudyfuramaresort.repository;

import casestudyfuramaresort.models.person_inheritance.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryIplm implements EmployeeRepository{
    private static List<Employee> employeeList;
    static {
        employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,"Tom","11/05/1981","Male",0001,125463963,"tomcruise@gmail.com","intermediate","receptionist",800));
        employeeList.add(new Employee(2,"Tony","27/09/1985","Male",0002,789512398,"tomcruise@gmail.com","intermediate","receptionist",750));
        employeeList.add(new Employee(3,"Tom","11/05/1981","Male",4567,753159987,"tomcruise@gmail.com","intermediate","receptionist",321));
        employeeList.add(new Employee(4,"Tom","11/05/1981","Male",1334,026753321,"tomcruise@gmail.com","intermediate","receptionist",985));
        employeeList.add(new Employee(5,"Tom","11/05/1981","Male",6780,369852741,"tomcruise@gmail.com","intermediate","receptionist",200));
    }
    @Override
    public List<Employee> findAll() {
        return employeeList;
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void updateEmPloyee(Employee employee) {
        employeeList.set(employee.getId(),employee );
    }

    @Override
    public void remove(int id) {
        employeeList.remove(id);
    }

    @Override
    public Employee findById(int id) {
        return employeeList.get(id);
    }
}
