package dev.patika.o1sp.antipattern;

import dev.patika.o1sp.pitfall.Invoice;

public class InvoicePersistence {
    private Invoice invoice;

    public InvoicePersistence(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToFile(String filename) {
        // Creates a file with given name and writes the invoice
    }

}
