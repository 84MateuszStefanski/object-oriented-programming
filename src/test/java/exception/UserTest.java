package exception;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void shouldCreateUser() {
        //given & when
        User user = User.create("admin1","admin12345","Admin", "admin@admin.pl");
        //then
        assertThat(user).isNotNull();
        assertThat(user.getFirstName()).isEqualTo("Admin");



    }

    @Test
    void shouldThrowNullPointerException() {

        assertThrows(NullPointerException.class, () -> {
        User.create(null,null,"Admin", "admin@admin.pl");
        });


    }

    @Test
    void shouldThrowExceptionWhenLoginToShort() {

        assertThrows(IllegalArgumentException.class, () ->{
            User.create("Ada","admin12345","Admin", "admin@admin.pl");
        });

    }


}