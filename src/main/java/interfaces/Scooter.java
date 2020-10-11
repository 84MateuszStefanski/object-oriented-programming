package interfaces;

import java.math.BigDecimal;

public class Scooter {

    private static final BigDecimal PRICE_PER_HOUR = BigDecimal.valueOf(10);

    private String brand;

    public Scooter(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return "Hulajnoga marki " + this.brand;
    }

    public BigDecimal calcPrice (int hours) {
        BigDecimal bigDecimalHours = BigDecimal.valueOf(hours);
        return PRICE_PER_HOUR.multiply(bigDecimalHours);
    }
}
