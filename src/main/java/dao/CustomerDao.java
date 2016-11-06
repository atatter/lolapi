package dao;

import model.Customer;

import java.util.List;

public interface CustomerDao {

    void insertCustomer(Customer customer);

    Customer getCustomer(Long id);

    List<Customer> getAllCustomers();

    List<Customer> searchCustomers(String key);

    void deleteAllCustomers();

    void deleteCustomer(Long id);

}
