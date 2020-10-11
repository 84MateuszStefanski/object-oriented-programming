package interfaces;

public class SmsService {

//    public void sendRentConfirmation(Car car) {
//        System.out.println("Potwierdzenie wypożyczenia " + car.getDescription());
//    }
//
//    public void sendRentConfirmation(Scooter scooter) {
//        System.out.println("Potwierdzenie wypożyczenia " + scooter.getDescription());
//    }

    // zapis poniżej daje to samo co te dwa wyzej

    public void sendRentConfirmation(Rentable rentable) {
        System.out.println("Potwierdzenie wypożyczenia " + rentable.getDescription());
    }
}
