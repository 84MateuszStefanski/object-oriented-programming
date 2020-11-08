package gun;

public class GunSkeleton extends GunParts{

    private String skeletonType;
    private double weight;
    private double length;
    private String material;

    public GunSkeleton(String modelName, String producer, double price, String skeletonType, double weight, double length, String material) {
        super(modelName, producer, price);
        this.skeletonType = skeletonType;
        this.weight = weight;
        this.length = length;
        this.material = material;
    }

    public String getSkeletonType() {
        return skeletonType;
    }

    public double getWeight() {
        return weight;
    }

    public double getLength() {
        return length;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "GunSkeleton{" +
                "skeletonType='" + skeletonType + '\'' +
                ", weight=" + weight +
                ", length=" + length +
                ", material='" + material + '\'' +
                '}';
    }
}

