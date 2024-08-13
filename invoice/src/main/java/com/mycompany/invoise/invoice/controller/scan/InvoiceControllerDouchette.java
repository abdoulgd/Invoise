package com.mycompany.invoise.invoice.controller.scan;

import com.mycompany.invoise.invoice.controller.InvoiceControllerInterface;
import com.mycompany.invoise.core.entity.customer.Customer;
import com.mycompany.invoise.core.entity.invoice.Invoice;
import com.mycompany.invoise.invoice.service.InvoiceServiceInterface;

//@Controller
public class InvoiceControllerDouchette implements InvoiceControllerInterface {

    private InvoiceServiceInterface invoiceServiceInterface;

    public InvoiceServiceInterface getInvoiceServiceInterface() {
        return invoiceServiceInterface;
    }

    @Override
    public String createInvoice(Invoice invoice) {
        System.out.println("Usage of a scanner");
        invoice = new Invoice();
        Customer customer = new Customer("Virgin Galactic");
        invoice.setCustomer(customer);
        invoiceServiceInterface.createInvoice(invoice);

        return null;
    }

    @Override
    public void setInvoiceServiceInterface(InvoiceServiceInterface invoiceServiceInterface) {
        this.invoiceServiceInterface = invoiceServiceInterface;
    }
}
