package abstractMethods;

public class Hexagon extends Figure{

    private double sideA;

    public Hexagon(double sideA){
        this.sideA = sideA;
    }

    @Override
    public double calculateArea() {
        double areaHex = ((3 * Math.sqrt(3)) / 2) * sideA;
       return areaHex;
    }

    @Override
    public double calculateCircuit() {
        return sideA * 6;
    }

    @Override
    public String figureName() {
        return "This is hexagon";
    }
}
