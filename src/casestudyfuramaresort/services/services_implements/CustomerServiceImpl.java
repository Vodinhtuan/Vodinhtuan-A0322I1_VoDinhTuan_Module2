package casestudyfuramaresort.services.services_implements;

import casestudyfuramaresort.models.person_inheritance.Customer;
import casestudyfuramaresort.repository.CustomerRepository;
import casestudyfuramaresort.repository.CustomerRepositoryIplm;
import casestudyfuramaresort.services.interface_services.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository repository = new CustomerRepositoryIplm();
    @Override
    public List<Customer> findAll() {
        return repository.findAll();
    }

    @Override
    public void addCustomer(Customer customer) {
        repository.addCustomer(customer);
    }

    @Override
    public void updateCustomer(int id, Customer customer) {
        repository.updateCustomer(id,customer);
    }
}
