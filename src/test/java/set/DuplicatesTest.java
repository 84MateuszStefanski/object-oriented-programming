package set;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DuplicatesTest {
    @Test
    void shoulReturnWithoutDuplicates(){
        //given
        List<String> list = Arrays.asList(
          "Poniedziałek",
          "Wtorek",
          "Wtorek",
          "Sroda"
        );
        //when
        List<String> result = Duplicates.removeDuplicates(list);
        //then
        assertThat(result).containsExactly("Poniedziałek", "Wtorek", "Sroda");

    }

    @Test
    void shoulReturnWithoutDuplicates2(){
        //given
        List<String> list = Arrays.asList(
                "Poniedziałek",
                "Wtorek",
                "Wtorek",
                "Sroda"
        );
        //when
        List<String> result = Duplicates.removeDuplicates2(list);
        //then
        assertThat(result).containsExactly("Poniedziałek", "Wtorek", "Sroda");

    }

    @Test
    void shoulReturnWithoutDuplicatesStream(){
        //given
        List<String> list = Arrays.asList(
                "Poniedziałek",
                "Wtorek",
                "Wtorek",
                "Sroda"
        );
        //when
        List<String> result = Duplicates.removeDuplicatesStream(list);
        //then
        assertThat(result).containsExactly("Poniedziałek", "Wtorek", "Sroda");

    }

}