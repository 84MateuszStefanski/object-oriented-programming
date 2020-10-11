package interfaces;

import java.math.BigDecimal;

public class Car {

    private static final BigDecimal PRICE_PER_HOUR = BigDecimal.valueOf(20);

    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String description() {
        return " Samochód marki " + this.brand + " model " + this.model + " rok produkcji " + this.year;

    }

    public BigDecimal calculatePrice(int hours) {
        BigDecimal bigDecimalHours = BigDecimal.valueOf(hours);
        return PRICE_PER_HOUR.multiply(bigDecimalHours);
    }
}
