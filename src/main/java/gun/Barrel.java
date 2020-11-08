package gun;

public class Barrel extends GunParts{


    private double sizeInInch;
    private String silencer;

    public Barrel(String modelName, String producer, double price, double sizeInInch, String silencer) {
        super(modelName, producer, price);
        this.sizeInInch = sizeInInch;
        this.silencer = silencer;
    }

    public double getSizeInInch() {
        return sizeInInch;
    }

    public String getSilencer() {
        return silencer;
    }

    @Override
    public String toString() {
        return "Barrel{" +
                "sizeInInch=" + sizeInInch +
                ", silencer='" + silencer + '\'' +
                '}';
    }
}
