package casestudyfuramaresort.repository;

import casestudyfuramaresort.models.person_inheritance.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
    void addCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void remove(int id);
    Customer findById(int id);
}
