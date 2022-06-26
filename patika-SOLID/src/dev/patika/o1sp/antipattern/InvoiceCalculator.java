package dev.patika.o1sp.antipattern;

public class InvoiceCalculator {
    private Invoice invoice;

    public InvoiceCalculator(Invoice invoice) {
        this.invoice = invoice;
    }

    public double calculateTotal() {
        double price = ((invoice.getBook().getPrice() - invoice.getBook().getPrice() * invoice.getQuantity()) * invoice.getQuantity());

        double priceWithTaxes = price * (1 + invoice.getTaxRate());

        return priceWithTaxes;
    }
}
