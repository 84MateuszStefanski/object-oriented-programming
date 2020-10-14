package abstractMethods;

public class Triangle extends Figure {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    @Override
    public double calculateArea() {
        double halfCircuit = (sideA+sideB+sideC) / 2; // wzór Herona na pole trójkąta
        double area = Math.sqrt(halfCircuit*(halfCircuit-sideA)*(halfCircuit-sideB)*(halfCircuit-sideC));
        return area;
    }
    @Override
    public double calculateCircuit() {
        return sideA + sideB + sideC;
    }

    @Override
    public String figureName() {
        return "This is Triangle";
    }
}
