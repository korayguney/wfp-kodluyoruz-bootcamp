package dev.patika.o2ocp.antipattern;

import dev.patika.o1sp.antipattern.Invoice;

public class FilePersistence implements InvoicePersistence{
    @Override
    public void save(Invoice invoice) {
        // save to file...
    }
}
