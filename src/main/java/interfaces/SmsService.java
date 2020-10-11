package interfaces;

public class SmsService {

    public void sentRentConfirmation(Car car) {
        System.out.println("Potwierdzenie wypożyczenia " + car.description());
    }

    public void sentRentConfirmation(Scooter scooter) {
        System.out.println("Potwierdzenie wypożyczenia " + scooter.getDescription());
    }
}
