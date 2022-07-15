package casestudyfuramaresort.services.interface_services;

import casestudyfuramaresort.models.person_inheritance.Customer;

import java.util.List;

public interface CustomerService extends Service {
    List<Customer> findAll();
    void addCustomer(Customer customer);
    void updateCustomer(int id, Customer customer);
}
