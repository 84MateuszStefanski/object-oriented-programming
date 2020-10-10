package computer;

public class Computer {
    private Processor processor;
    private GraphicCard graphicCard;
    private PowerSuply powerSuply;

    public Computer(Processor processor, GraphicCard graphicCard, PowerSuply powerSuply) {
        this.processor = processor;
        this.graphicCard = graphicCard;
        this.powerSuply = powerSuply;
    }

    public Processor getProcessor() {
        return processor;
    }

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    public PowerSuply getPowerSuply() {
        return powerSuply;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", graphicCard=" + graphicCard +
                ", powerSuply=" + powerSuply +
                '}';
    }
}
