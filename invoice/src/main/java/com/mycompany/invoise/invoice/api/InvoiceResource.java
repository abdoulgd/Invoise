package com.mycompany.invoise.invoice.api;

import com.mycompany.invoise.core.entity.customer.Address;
import com.mycompany.invoise.core.entity.customer.Customer;
import com.mycompany.invoise.core.entity.invoice.Invoice;
import com.mycompany.invoise.invoice.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/invoice")
public class InvoiceResource {

    @Autowired
    private InvoiceServiceInterface invoiceServiceInterface;

    @Autowired
    private RestTemplate restTemplate;
/*
    @PostMapping
    public Invoice create(@RequestBody Invoice invoice){

        return invoiceServiceInterface.createInvoice(invoice);
    }
*/
    @GetMapping
    public Iterable<Invoice> list(){
        System.out.println("La méthode display Home à été invoquée");
        Iterable<Invoice> invoices = invoiceServiceInterface.getInvoiceList();
        invoices.forEach(invoice -> {
            invoice.setCustomer(restTemplate.getForObject("http://customer/customer/"+invoice.getIdCustomer(),
                    Customer.class));
        });
        return invoices;
    }

    @GetMapping("/{id}")
    public Invoice get(@PathVariable("id") String number){
        System.out.println("La méthode get à été invoquée");
        Invoice invoice = invoiceServiceInterface.getInvoiceByNumber(number);
        final Customer customer = restTemplate.getForObject("http://customer/customer/"+invoice.getIdCustomer(),
                Customer.class);
        final Address address = restTemplate.getForObject("http://customer/address/"+customer.getAddress().getId(),
                Address.class);
        customer.setAddress(address);
        invoice.setCustomer(customer);

        return invoice;
    }

    /*@GetMapping("/create-form")
    public String displayInvoiceCreateForm(Model model) {
        model.addAttribute("invoiceForm", new InvoiceForm());
        return "invoice-create-form";
    }*/

    public InvoiceServiceInterface getInvoiceServiceInterface() {
        return invoiceServiceInterface;
    }

    public void setInvoiceServiceInterface(InvoiceServiceInterface invoiceServiceInterface) {
        this.invoiceServiceInterface = invoiceServiceInterface;
    }

    public RestTemplate getRestTemplate() {
        return restTemplate;
    }

    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
