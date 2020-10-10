package car;

public class Zadanie1 {
    public static void main(String[] args) {
        Car opel = new Car("Opel ", "Astra");
        System.out.println(opel.description());
        System.out.println(opel.getBrand());
        opel.setModel("Insignia");
        System.out.println(opel.getModel());

        Car mercedes = new Car("Mercedes ", "S600");
        Car ford = new Car("Ford ", "Focus");

        Car[] cars = {opel, mercedes, ford};

        for (Car car : cars) {
            System.out.println(car.description());
        }

    }
}
