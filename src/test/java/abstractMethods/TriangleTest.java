package abstractMethods;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void calculateArea() {
        //given
        Triangle triangle = new Triangle(3, 4,5,);
        //when
        double result = triangle.calculateArea();
        //then
        assertThat(result).isEqualTo(10);
    }

    @Test
    void calculateCircuit() {
    }
}