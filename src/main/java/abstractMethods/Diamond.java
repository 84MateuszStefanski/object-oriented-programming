package abstractMethods;

public class Diamond extends Figure {

    private double sideA;
    private double height;

    public Diamond(double sideA, double height){
        this.sideA = sideA;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return sideA * height;
    }

    @Override
    public double calculateCircuit() {
        return sideA*4 ;
    }

    @Override
    public String figureName() {
        return "This is diamond";
    }

}
