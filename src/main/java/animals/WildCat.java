package animals;

public class WildCat extends Cat {
    private String continentOfOccurrence;

    public WildCat(String name, int age, String race, String continentOfOccurrence) {
        super(name, age, race);
        this.continentOfOccurrence = continentOfOccurrence;
    }

    @Override
    public void voice() {
        System.out.println("Roooar");
    }
}
