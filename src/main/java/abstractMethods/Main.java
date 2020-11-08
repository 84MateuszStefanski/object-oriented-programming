package abstractMethods;

public class Main {
    public static void main(String[] args) {
        double radius = 5;
        double circuit = 2 * Math.PI * radius;
        System.out.println(circuit);

        Rectangle rectangle = new Rectangle(2,4);
        System.out.println(rectangle.figureName());
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculateCircuit());

        Hexagon hexagon = new Hexagon(3);
        System.out.println(hexagon.calculateArea());
    }

}
