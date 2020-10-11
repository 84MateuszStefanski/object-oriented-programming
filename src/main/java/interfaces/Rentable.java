package interfaces;

import java.math.BigDecimal;

public interface Rentable {

    String getDescription();

    BigDecimal calculatePrice(int hours);

}
