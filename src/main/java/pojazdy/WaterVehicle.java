package pojazdy;

public class WaterVehicle extends Vehicle {
    private int displacement;

    public WaterVehicle(String type, int dateOfProd, String typeOfEngine, double maxSpeed, double weight, int displacement) {
        super(type, dateOfProd, typeOfEngine, maxSpeed, weight);
        this.displacement = displacement;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    @Override
    public void action() {
        System.out.println(" boating ");
    }
}
