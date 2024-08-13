package com.mycompany.invoise.invoice.service.number;

import com.mycompany.invoise.core.entity.invoice.Invoice;
import com.mycompany.invoise.invoice.repository.InvoiceRepositoryInterface;
import com.mycompany.invoise.invoice.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class InvoiceServiceNumber implements InvoiceServiceInterface {

    @Autowired
    private InvoiceRepositoryInterface invoiceRepositoryInterface;

    /*@Autowired
    private CustomerRepositoryInterface customerRepositoryInterface;*/

    @Transactional
    @Override
    public Invoice createInvoice(Invoice invoice) {
        //customerRepositoryInterface.save(invoice.getCustomer());
        return invoiceRepositoryInterface.save(invoice);
    }

    @Override
    public Iterable<Invoice> getInvoiceList() {
        return invoiceRepositoryInterface.findAll();
        /*Iterable<Invoice> invoices = invoiceRepositoryInterface.findAll();
        //Ceci permet d'initiliser les clients(customers) de chaque facture(invoice)
        invoices.forEach(invoice -> invoice.getCustomer().getName());
        return invoices;*/
    }

    @Override
    public Invoice getInvoiceByNumber(String number) {
        return invoiceRepositoryInterface.findById(number).orElseThrow();
    }

    @Override
    public void setInvoiceRepositoryInterface(InvoiceRepositoryInterface invoiceRepositoryInterface) {
        this.invoiceRepositoryInterface = invoiceRepositoryInterface;
    }

    public InvoiceRepositoryInterface getInvoiceRepositoryInterface() {
        return invoiceRepositoryInterface;
    }
}
