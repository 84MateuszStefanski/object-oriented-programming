package pojazdy;

public class Vehicle {

    private String type;
    private int dateOfProd;
    private String typeOfEngine;
    private double maxSpeed;
    private double weight;

    public Vehicle(String type, int dateOfProd, String typeOfEngine, double maxSpeed, double weight) {
        this.type = type;
        this.dateOfProd = dateOfProd;
        this.typeOfEngine = typeOfEngine;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDateOfProd() {
        return dateOfProd;
    }

    public void setDateOfProd(int dateOfProd) {
        this.dateOfProd = dateOfProd;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void action() {
        System.out.println(" ....  ");
    }
}
