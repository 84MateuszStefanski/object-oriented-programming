package exception;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void shouldAddUserToList() throws UserLoginIsInDataBaseException {
        //given
        Library library = new Library("Sezamkowa 10");
        User user = User.create("admin1","admin12345","Admin", "admin@admin.pl");
        //when
        library.addUser(user);
        //then
        assertThat(library.getUsers().size()).isEqualTo(1);
    }

    @Test
    void shouldThrowExceptionUserExist() throws UserLoginIsInDataBaseException {
        //given
        Library library = new Library("Sezamkowa 10");
        User user = User.create("admin1","admin12345","Admin", "admin@admin.pl");
        //when
        library.addUser(user);
        //then
        assertThrows(UserLoginIsInDataBaseException.class, () -> {library.addUser(user); });
    }

    @Test
    void shouldRetrieveCreatedUsersBefore() throws UserLoginIsInDataBaseException {
        //given
        Library library = new Library("Sezamkowa 10");
        User user1 = User.create("adminasas","admin12345","Admin", "admin@admin.pl");
        User user2 = User.create("admin11111","admin12345","Admin", "admin@admin.pl");
        User user3 = User.create("admin2221","admin12345","Admin", "admin@admin.pl");
        user1.setCreationData(LocalDateTime.of(2020,01,01,12,00));
        user2.setCreationData(LocalDateTime.of(2020,02,03,12,00));
        user3.setCreationData(LocalDateTime.of(2020,03,01,12,00));
        library.addUser(user1);
        library.addUser(user2);
        library.addUser(user3);
        //when
        LocalDateTime date = LocalDateTime.of(2020, 2,1,10,10);
        List<User> result = library.retrieveCreatedUsersBefore(date);
       //then
        assertThat(result.size()).isEqualTo(1);
    }
}