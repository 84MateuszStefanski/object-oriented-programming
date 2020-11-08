package gun;

public class Magazine extends GunParts{

    private int capacity;



    public Magazine(String modelName, String producer, double price, int capacity) {
        super(modelName, producer, price);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "capacity=" + capacity +
                '}';
    }
}
