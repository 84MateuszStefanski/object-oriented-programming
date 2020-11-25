package metadane;

public class Employe {

    private String name;
    private int age;
    public Employe() {
    }
    public Employe(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @MyAnnotation (name="type", value = "superMetoda")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Deprecated
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Employe{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
