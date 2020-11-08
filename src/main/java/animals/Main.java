package animals;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Zwierze",10,"");
        Cat cat = new Cat("Mruczek", 4,"Dachowiec");
        Dog dog = new Dog("Reksio",5,"Beagle","Tricolor");
        Bird bird = new Bird("Papug", 3, "Parrot", 3);

        Animal[] animals = {animal, cat, dog};
        for (Animal tab : animals){
            System.out.println(tab.getAge());
            System.out.println(tab.getName());
            tab.voice();
        }

    }
}
