package computer;

public class GraphicCard {

    private String name;

    public GraphicCard(String name) {
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
