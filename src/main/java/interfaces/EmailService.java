package interfaces;

public class EmailService {

    public void sentRentConfirmation(Car car) {
        System.out.println("Wypożyczono " + car.description());
    }

    public void sentRentConfirmation(Scooter scooter) {
        System.out.println("Wypożyczono " + scooter.getDescription());
    }
}
