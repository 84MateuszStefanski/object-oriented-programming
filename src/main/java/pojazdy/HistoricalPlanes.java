package pojazdy;

public class HistoricalPlanes extends AirVehicle {

    private String usedMaterial;

            public HistoricalPlanes(String type, int dateOfProd, String typeOfEngine, double maxSpeed, double weight, int wingsRange,String usedMaterial){
                super(type, dateOfProd, typeOfEngine, maxSpeed, weight, wingsRange);
                this.usedMaterial = usedMaterial;
            }

    public String getUsedMaterial() {
        return usedMaterial;
    }

    public void setUsedMaterial(String usedMaterial) {
        this.usedMaterial = usedMaterial;
    }

    @Override
    public void action() {
        System.out.println(" flying ");
    }
}
