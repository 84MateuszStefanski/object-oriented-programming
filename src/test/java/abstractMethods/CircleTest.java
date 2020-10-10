package abstractMethods;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
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