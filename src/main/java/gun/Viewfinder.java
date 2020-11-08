package gun;

public class Viewfinder extends GunParts{

    private double magnification;
    private String thermovision;
    private String crosshairShape;

    public Viewfinder(String modelName, String producer, double price, double magnification, String thermovision, String crosshairShape) {
        super(modelName, producer, price);
        this.magnification = magnification;
        this.thermovision = thermovision;
        this.crosshairShape = crosshairShape;
    }

    public double getMagnification() {
        return magnification;
    }

    public String getThermovision() {
        return thermovision;
    }

    public String getCrosshairShape() {
        return crosshairShape;
    }

    @Override
    public String toString() {
        return "Viewfinder{" +
                "magnification=" + magnification +
                ", thermovision='" + thermovision + '\'' +
                ", crosshairShape='" + crosshairShape + '\'' +
                '}';
    }
}
