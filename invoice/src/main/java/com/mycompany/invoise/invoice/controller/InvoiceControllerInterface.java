package com.mycompany.invoise.invoice.controller;

import com.mycompany.invoise.core.entity.invoice.Invoice;
import com.mycompany.invoise.invoice.service.InvoiceServiceInterface;

//@Controller
public interface InvoiceControllerInterface {
    String createInvoice(Invoice invoice);
    void setInvoiceServiceInterface(InvoiceServiceInterface invoiceServiceInterface);
}
