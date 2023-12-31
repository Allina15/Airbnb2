package airbnb.service;

import airbnb.model.Customer;

import java.util.List;

public interface CustomerService {
    void save(Customer customer);
    List<Customer> getAllCustomers();
    String delete(Long id);
    String update(Long id, Customer newCustomer);
    Customer getById(Long id);
}
