package computer;

public class ComputerFactory {

    public static Computer createComputer(String processorName, String graphicCardName, String powerSuplyName) {
        Processor processor = new Processor(processorName);
        GraphicCard graphicCard = new GraphicCard(graphicCardName);
        PowerSuply powerSuply = new PowerSuply(powerSuplyName);

        return new Computer(processor,graphicCard,powerSuply);
    }
}
