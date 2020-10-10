package computer;

public class Main {
    public static void main(String[] args) {

        Processor proc1 = new Processor("Intel i7");
        GraphicCard card1 = new GraphicCard("GeeForce GTX600");
        PowerSuply suply1 = new PowerSuply("220V");

        Computer computer1 = new Computer(proc1, card1, suply1);

        System.out.println(computer1.getGraphicCard());
        System.out.println(computer1.toString());
        System.out.println(computer1);

        Computer computer2 = ComputerFactory.createComputer("i5", "RTX 2070","600W");
        System.out.println(computer2);

    }
}
