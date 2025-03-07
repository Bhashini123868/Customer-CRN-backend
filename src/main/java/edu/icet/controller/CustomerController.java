package edu.icet.controller;

import edu.icet.dto.Customer;
import edu.icet.service.CustomerService;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService service;

    @PostMapping("/add-customer")
    public void addCustomer(@RequestBody Customer customer){
        service.addCustomer(customer);
    }
    @GetMapping("/get-all")
    public List<Customer> getAll(){
        return service.getAll();
    }
    @DeleteMapping("/delete/{id}")
    public Boolean deleteCustomerById(@PathVariable Integer id){
        return service.deleteCustomer(id);
    }
    @PutMapping("/update")
    public Customer updateCustomer(@RequestBody Customer customer){
       return service.updateCustomer(customer);
    }
    @GetMapping("/search-by-id/{id}")
    public Customer searchCustomerById(@PathVariable Integer id){
        return service.searchCustomerById(id);
    }
}
