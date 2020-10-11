package interfaces;

public class EmailService {

//    public void sendRentConfirmation(Car car) {
//        System.out.println("Wypożyczono " + car.getDescription());
//    }
//
//    public void sendRentConfirmation(Scooter scooter) {
//        System.out.println("Wypożyczono " + scooter.getDescription());
//    }

    public void sendRentConfirmation(Rentable rentable) {
        System.out.println("Potwierdzenie wypożyczenia " + rentable.getDescription());
    }
}
