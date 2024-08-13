package com.mycompany.invoise.invoice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvoiceControllerWeb {

    /*@Autowired
    private InvoiceServiceInterface invoiceServiceInterface;

    public InvoiceServiceInterface getInvoiceServiceInterface() {
        return invoiceServiceInterface;
    }

    public void setInvoiceServiceInterface(InvoiceServiceInterface invoiceServiceInterface) {
        this.invoiceServiceInterface = invoiceServiceInterface;
    }

    @PostMapping("/create")
    public String createInvoice(@Valid @ModelAttribute InvoiceForm invoiceForm, BindingResult result){
        //On peut supprimer l'annotation @ModelAttribute si on ne compte pas donner un identifiant
        // personnalisé au backing bean

        if(result.hasErrors()){
            return "invoice-create-form";
        }

        Invoice invoice = new Invoice();
        Customer customer = new Customer(invoiceForm.getCustomerName());
        invoice.setCustomer(customer);

        Address address = new Address(invoiceForm.getStreetName(), invoiceForm.getStreetNumber(), invoiceForm.getZipCode(), invoiceForm.getCity(), invoiceForm.getCountry());
        customer.setAddress(address);

        invoice.setOrderNumber(invoiceForm.getOrderNumber());//
        invoiceServiceInterface.createInvoice(invoice);
        return "invoice-created";
    } */

    @GetMapping("/home")
    public String displayHome(Model model){
        System.out.println("La méthode display Home à été invoquée");
        /*ModelAndView mv = new ModelAndView("invoice-home");
        model.addAttribute("invoices", invoiceServiceInterface.getInvoiceList());*/

        return "invoice-home";
    }

    /*@GetMapping("/{id}")
    public String displayInvoice(@PathVariable("id") String number, Model model){
        System.out.println("La méthode display Invoice à été invoquée");
        ModelAndView mv = new ModelAndView("invoice-details");
        model.addAttribute("invoice",invoiceServiceInterface.getInvoiceByNumber(number));
        //Invoice invoice = invoiceServiceInterface.getInvoiceById(id);

        return "invoice-details";
    }*/

   /* @GetMapping("/create-form")
    public String displayInvoiceCreateForm(Model model) {
        model.addAttribute("invoiceForm", new InvoiceForm());
        return "invoice-create-form";
    } */
}
