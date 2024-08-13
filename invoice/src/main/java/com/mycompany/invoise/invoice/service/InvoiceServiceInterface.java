package com.mycompany.invoise.invoice.service;

import com.mycompany.invoise.core.entity.invoice.Invoice;
import com.mycompany.invoise.invoice.repository.InvoiceRepositoryInterface;

//@Service
public interface InvoiceServiceInterface {
    Invoice createInvoice(Invoice invoice);
    Iterable<Invoice> getInvoiceList();
    Invoice getInvoiceByNumber(String number);
    void setInvoiceRepositoryInterface(InvoiceRepositoryInterface invoiceRepositoryInterface);
}
