package exception;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class User {

    private String login;
    private String password;
    private String firstName;
    private String email;
    private LocalDateTime creationData;

    private User(String login, String password, String firstName, String email, LocalDateTime creationData) {
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.email = email;
        this.creationData = creationData;
    }
    // factory method
    // metoda do tworzenia obiektu bez uzycia konstruktora
    public static User create(String login, String password, String firstName, String email) {

        if (login == null || email == null || password == null || firstName == null) {
            throw new NullPointerException("Please fill the empty space ");
        }

        if (login.length() < 6) {
            throw new IllegalArgumentException("Login is too short,should be at least 6 chars");

        }

        return new User(login,password,firstName,email,LocalDateTime.now());
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getCreationData() {
        return creationData;
    }

    public void setCreationData(LocalDateTime creationData) {
        this.creationData = creationData;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", creationData=" + creationData +
                '}';
    }
}
