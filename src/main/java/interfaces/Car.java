package interfaces;

import java.math.BigDecimal;

public class Car implements Rentable {

    private static final BigDecimal PRICE_PER_HOUR = BigDecimal.valueOf(20);

    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    @Override
    public String getDescription() {
        return " Samochód marki " + this.brand + " model " + this.model + " rok produkcji " + this.year;

    }
    @Override
    public BigDecimal calculatePrice(int hours) {
        BigDecimal bigDecimalHours = BigDecimal.valueOf(hours);
        return PRICE_PER_HOUR.multiply(bigDecimalHours);
    }
}
