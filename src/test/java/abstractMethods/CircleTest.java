package abstractMethods;

import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void shouldCalculateArea() {
        //given
        Circle circle = new Circle(5);
        //when
        double result = circle.calculateArea();
        //then
        assertThat(result).isEqualTo(78.53981633974483);
        assertThat(result).isCloseTo(78.53, offset(0.01));// ten zapis pozwala na granicę błędu offset

    }

    @Test
    void shouldCalculateCircuit() {
        //given
        Circle circle = new Circle(5);
        //when
        double result = circle.calculateCircuit();
        //then
        assertThat(result).isEqualTo(31.41592653589793);
    }
}