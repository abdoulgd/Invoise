package com.mycompany.invoise.customer.repository;

import com.mycompany.invoise.core.entity.customer.Customer;
import org.springframework.data.repository.CrudRepository;


//@Repository
public interface CustomerRepositoryInterface extends CrudRepository<Customer, Long> {
    /*Invoice create(Invoice invoice);
    List<Invoice> list();
    Invoice getById(String number);*/
}
