package abstractMethods;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void shouldCalculateArea() {
        //given
       // Triangle triangle = new Triangle(3, 4,5);
        //when
        //double result = triangle.calculateArea();
        //then
       // assertThat(result).isEqualTo(12);
    }

    @Test
    void shouldCalculateCircuit() {
        //given
       Triangle triangle = new Triangle(3, 4,5);
        //when
        double result = triangle.calculateCircuit();
        //then
        assertThat(result).isEqualTo(12);
    }
}