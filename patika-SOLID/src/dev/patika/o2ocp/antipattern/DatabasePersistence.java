package dev.patika.o2ocp.antipattern;

import dev.patika.o1sp.antipattern.Invoice;

public class DatabasePersistence implements InvoicePersistence{
    @Override
    public void save(Invoice invoice) {
        // save to db...
    }
}
