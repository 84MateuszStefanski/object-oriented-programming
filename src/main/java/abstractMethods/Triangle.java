package abstractMethods;

public class Triangle extends Figure {

    private double sideA;
    private double sideB;
    private double sideC;
    private double height;

    public Triangle(double sideA, double sideB, double sideC, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double area = (0.5 * sideA) * height;
        return area;
    }

    @Override
    public double calculateCircuit() {
        return sideA + sideB + sideC;
    }
}
