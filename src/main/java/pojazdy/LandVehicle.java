package pojazdy;

public class LandVehicle extends Vehicle {
    private String bodyType;
    private String wheelsType;

    public LandVehicle(String type, int dateOfProd, String typeOfEngine, double maxSpeed, double weight, String bodyType, String wheelsType) {
        super(type, dateOfProd, typeOfEngine, maxSpeed, weight);
        this.bodyType = bodyType;
        this.wheelsType = wheelsType;
    }

    @Override
    public void action() {
        System.out.println(" driving ");
    }

}
