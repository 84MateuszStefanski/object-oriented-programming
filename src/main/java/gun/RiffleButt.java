package gun;

public class RiffleButt extends GunParts{

    private String riffleButtMount;
    private double length;

    public RiffleButt(String modelName, String producer, double price, String riffleButtMount, double length) {
        super(modelName, producer, price);
        this.riffleButtMount = riffleButtMount;
        this.length = length;
    }

    public String getRiffleButtMount() {
        return riffleButtMount;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "RiffleButt{" +
                "riffleButtMount='" + riffleButtMount + '\'' +
                ", length=" + length +
                '}';
    }
}
