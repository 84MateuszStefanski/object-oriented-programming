package abstractMethods;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    @Override
    public double calculateCircuit() {
        double circuit = 2 * Math.PI*radius;
        return circuit;
    }
}
