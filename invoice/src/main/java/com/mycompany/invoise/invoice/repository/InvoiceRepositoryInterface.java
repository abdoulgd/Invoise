package com.mycompany.invoise.invoice.repository;

import com.mycompany.invoise.core.entity.invoice.Invoice;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;


//@Repository
public interface InvoiceRepositoryInterface extends CrudRepository<Invoice, String> {
}
