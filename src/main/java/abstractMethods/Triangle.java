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

    public double calculateArea() {
        double halfCircuit = (sideA+sideB+sideC) / 2
        double area = Math.sqrt(halfCircuit(halfCircuit-sideA)(halfCircuit-sideB)(halfCircuit-sideC));
        return area;
    }

    public double calculateCircuit() {
        return sideA + sideB + sideC;
    }
}
