package computer;

public class PowerSuply {
    private String name;

    public PowerSuply(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return name;
    }

}
