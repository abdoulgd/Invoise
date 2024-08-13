package com.mycompany.invoise.invoice.service.prefix;

import com.mycompany.invoise.core.entity.invoice.Invoice;
import com.mycompany.invoise.invoice.repository.InvoiceRepositoryInterface;
import com.mycompany.invoise.invoice.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Value;

//@Service
public class InvoiceServicePrefix implements InvoiceServiceInterface {

    @Value("${invoice.lastnumber}")
    private  long lastNumber;

    @Value("${invoice.prefix}")
    private String prefix;

    //@Autowired
    private InvoiceRepositoryInterface invoiceRepositoryInterface;

    @Override
    public Invoice createInvoice(Invoice invoice) {
        invoice.setNumber(String.valueOf(prefix + (++lastNumber)));
        invoiceRepositoryInterface.save(invoice);

        return invoice;
    }

    @Override
    public Iterable<Invoice> getInvoiceList() {
        return invoiceRepositoryInterface.findAll();
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

    public long getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(long lastNumber) {
        this.lastNumber = lastNumber;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}
