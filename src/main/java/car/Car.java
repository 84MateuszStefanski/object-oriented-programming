package car;

public class Car {

    private String brand ;
    private String model ;

    public Car (String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String description() {
        return "Marka: " + this.brand + "Model: " + this.model;
    }


}
