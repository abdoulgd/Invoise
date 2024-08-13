package com.mycompany.invoise.customer.api;

import com.mycompany.invoise.core.entity.customer.Customer;
import com.mycompany.invoise.customer.repository.CustomerRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/customer")
public class CustomerResource {

    @Autowired
    private CustomerRepositoryInterface customerRepositoryInterface;

    @GetMapping("/{id}")
    public Customer get(@PathVariable("id") Long id){
        return customerRepositoryInterface.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public CustomerRepositoryInterface getCustomerRepositoryInterface() {
        return customerRepositoryInterface;
    }

    public void setCustomerRepositoryInterface(CustomerRepositoryInterface customerRepositoryInterface) {
        this.customerRepositoryInterface = customerRepositoryInterface;
    }
}
