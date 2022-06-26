package dev.patika.o2ocp.antipattern;

import dev.patika.o1sp.antipattern.Invoice;

public interface InvoicePersistence {
    void save(Invoice invoice);
}
