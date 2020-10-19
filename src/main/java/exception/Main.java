package exception;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj login");
        String login = scanner.next();
        System.out.println("Podaj hasło");
        String password = scanner.next();
        System.out.println("Podaj imie");
        String firstName = scanner.next();
        System.out.println("Podaj email");
        String email = scanner.next();

        User user1 = null;

        try {
            user1 = User.create(login,password,firstName,email);
        } catch (NullPointerException e){
            System.out.println("Something is null ");;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("User creation process ended ");
        }

        System.out.println(user1);



    }
}
