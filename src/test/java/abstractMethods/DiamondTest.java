package abstractMethods;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DiamondTest {

    @Test
    void shouldCalculateArea() {
        //given
        Diamond diamond = new Diamond(4, 6);
        //when
        double result = diamond.calculateArea();
        //then
        assertThat(result).isEqualTo(24);
    }

    @Test
    void calculateCircuit() {
        //given
        Diamond diamond = new Diamond(4, 6);
        //when
        double result = diamond.calculateCircuit();
        //then
        assertThat(result).isEqualTo(16);
    }
}