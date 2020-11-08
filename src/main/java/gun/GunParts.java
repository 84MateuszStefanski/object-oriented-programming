package gun;

public class GunParts {

    private String modelName;
    private String producer;
    private double price;

    public GunParts(String modelName, String producer, double price) {
        this.modelName = modelName;
        this.producer = producer;
        this.price = price;
    }

    public String getModelName() {
        return modelName;
    }

    public String getProducer() {
        return producer;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "GunParts{" +
                "modelName='" + modelName + '\'' +
                ", producer='" + producer + '\'' +
                ", price=" + price +
                '}';
    }
}
