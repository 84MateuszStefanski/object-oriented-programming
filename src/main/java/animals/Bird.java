package animals;

public class Bird extends Animal{

    private double wingspan;

    public Bird(String name, int age, String race, double wingspan) {
        super(name, age, race);
        this.wingspan = wingspan;
    }
    @Override
    public void voice() {
        System.out.println("Kra kra");
    }

}
