package com.mycompany.invoise.invoice.repository.database;

/*import com.mycompany.invoise.core.entity.invoice.Invoice;
import com.mycompany.invoise.core.repository.InvoiceRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Invoice create(Invoice invoice) {
        String sql = "INSERT INTO INVOICE (CUSTOMER_NAME, ORDER_NUMBER) VALUES (?,?)";
        KeyHolder kh = new GeneratedKeyHolder();

        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, invoice.getCustomerName());
            ps.setString(2, invoice.getOrderNumber());
            return ps;
        }, kh);

        invoice.setNumber(kh.getKey().toString());
        return invoice;


        //PreparedStatement pstmt = connection.prepareStatement("INSERT INTO FACTURE (NUMBER, CUSTOMER_NAME) VALUES (?,?,?)");
        //pstmt.executeUpdate();

        //System.out.println("Database: Invoice added with number " + invoice.getNumber() + " for " + invoice.getCustomerName());
    }

    @Override
    public List<Invoice> list() {
        String sql = "SELECT INVOICE_NUMBER, CUSTOMER_NAME FROM INVOICE";

        return jdbcTemplate.query(sql, (rs, rowNum) ->
                new Invoice(
                        String.valueOf(rs.getLong("INVOICE_NUMBER")),
                        rs.getString("CUSTOMER_NAME")
                ));

        //Invoice invoice1 = new Invoice();
        //invoice1.setNumber("NUM_1");
        //invoice1.setCustomerName("EDF");

        //Invoice invoice2 = new Invoice();
        //invoice2.setNumber("NUM_2");
        //invoice2.setCustomerName("La poste");

        //return List.of(invoice1, invoice2);
    }

    @Override
    public Invoice getById(String number) {
        String sql = "SELECT INVOICE_NUMBER, CUSTOMER_NAME, ORDER_NUMBER FROM INVOICE WHERE INVOICE_NUMBER = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{number}, (rs, rowNum) ->
                new Invoice(
                        String.valueOf(rs.getLong("INVOICE_NUMBER")),
                        rs.getString("CUSTOMER_NAME"),
                        rs.getString("ORDER_NUMBER")

                ));

        //return null;

        //Invoice invoice1 = new Invoice();
        //invoice1.setNumber(number);
        //invoice1.setCustomerName("EDF");
        //invoice1.setOrderNumber("ON_002");

        //return invoice1;
    }
}*/
