package animals;

public class Dog extends Animal {

    private String color;

    public Dog(String name, int age, String race, String color) {
        super(name, age, race);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void voice() {
        System.out.println("HauHau");
    }
}
