package interfaces;

import java.math.BigDecimal;

public class Trailer implements Rentable {
    private static final BigDecimal PRICE_PER_HOUR = BigDecimal.valueOf(10);
    private int capacity;

    public Trailer(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String getDescription() {
        return "Przyczepa o pojemności " + this.capacity;
    }

    @Override
    public BigDecimal calculatePrice(int hours) {
        BigDecimal bigDecimalHours = BigDecimal.valueOf(5);
        return PRICE_PER_HOUR.multiply(bigDecimalHours);
    }
}
