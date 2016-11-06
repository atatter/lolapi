package controller;

import dao.CustomerDao;
import model.Customer;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
public class CustomerController {

    @Resource
    private CustomerDao dao;

    @GetMapping("customers")
    public List<Customer> getAll() { return dao.getAllCustomers(); }

    @GetMapping("customers/{id}")
    public Customer getCustomer(@PathVariable Long id) { return dao.getCustomer(id); }

    @GetMapping("customers/search")
    public List<Customer> searchCustomer(@RequestParam(defaultValue = "") String key) { return dao.searchCustomers(key); }

    @PostMapping("customers")
    public void addCustomer(@RequestBody @Valid Customer customer) { dao.insertCustomer(customer); }

    @DeleteMapping("customers")
    public void deleteAllCustomers() { dao.deleteAllCustomers(); }

    @DeleteMapping("customers/{id}")
    public void deleteCustomer(@PathVariable Long id) { dao.deleteCustomer(id); }
}
