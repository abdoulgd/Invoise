package com.mycompany.invoise.invoice.controller.keyboard;

import com.mycompany.invoise.invoice.controller.InvoiceControllerInterface;
import com.mycompany.invoise.core.entity.customer.Customer;
import com.mycompany.invoise.core.entity.invoice.Invoice;
import com.mycompany.invoise.invoice.service.InvoiceServiceInterface;

import java.util.Scanner;

//@Controller
public class InvoiceControllerKeyboard implements InvoiceControllerInterface {

    private InvoiceServiceInterface invoiceServiceInterface;

    @Override
    public String createInvoice(Invoice invoice) {
        Scanner sc = new Scanner(System.in);

        System.out.println( "What is the customer name?" );
        String customerName = sc.nextLine();

        invoice = new Invoice();
        Customer customer = new Customer(customerName);
        invoice.setCustomer(customer);

        invoiceServiceInterface.createInvoice(invoice);
        return null;
    }

    public InvoiceServiceInterface getInvoiceServiceInterface() {
        return invoiceServiceInterface;
    }

    @Override
    public void setInvoiceServiceInterface(InvoiceServiceInterface invoiceServiceInterface) {
        this.invoiceServiceInterface = invoiceServiceInterface;
    }
}
