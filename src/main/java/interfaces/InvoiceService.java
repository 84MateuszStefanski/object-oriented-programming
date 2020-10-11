package interfaces;

import java.math.BigDecimal;

public class InvoiceService {

    public void generateInvoice(Car car, int hours) {
        BigDecimal price = car.calculatePrice(hours);
        System.out.println("Generowanie faktury , cena: " + price);
    }

    public void generateInvoice(Scooter scooter, int hours) {
        BigDecimal price = scooter.calcPrice(hours);
        System.out.println("Generowanie faktury , cena: " + price);
    }
}
