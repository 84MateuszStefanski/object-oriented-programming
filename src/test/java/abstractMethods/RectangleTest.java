package abstractMethods;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RectangleTest {
    @Test
    void shouldCalculateArea() {
        //given
        Rectangle rectangle = new Rectangle(5, 2);
        //when
        double result = rectangle.calculateArea();
        //then
        assertThat(result).isEqualTo(10);
    }

    @Test
    void shouldcalculateCircuit() {
        //given
        Rectangle rectangle = new Rectangle(5, 2);
        //when
        double result = rectangle.calculateCircuit();
        //then
        assertThat(result).isEqualTo(14);
    }

    @Test
    void shouldReturnFigureName() {
        //given
        Rectangle rectangle = new Rectangle(5, 2);
        //when
        String result = rectangle.figureName();
        //then
        assertThat(result).isEqualTo("This is rectangle");
    }


}