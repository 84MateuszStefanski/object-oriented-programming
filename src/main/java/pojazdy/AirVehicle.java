package pojazdy;

public class AirVehicle extends Vehicle{

    private int wingsRange;

    public AirVehicle(String type, int dateOfProd, String typeOfEngine, double maxSpeed, double weight, int wingsRange) {
        super(type, dateOfProd, typeOfEngine, maxSpeed, weight);
        this.wingsRange = wingsRange;
    }

    public int getWingsRange() {
        return wingsRange;
    }

    public void setWingsRange(int wingsRange) {
        this.wingsRange = wingsRange;
    }

    @Override
    public void action() {
        System.out.println(" flying ");
    }
}
