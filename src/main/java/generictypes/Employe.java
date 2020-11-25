package generictypes;

import metadane.MyAnnotation;

import java.util.Comparator;

public class Employe implements Comparator<Employe> {

    private String name;
    private int age;
    public Employe() {
    }
    public Employe(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @MyAnnotation(name="type", value = "superMetoda")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

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

    @Override
    public int compare(Employe o1, Employe o2) {
        int name =  o1.getName().charAt(0) - o2.getName().charAt(0);
        if(name == 0) {
            return o1.compareTo(o2);
        }
        return name;
    }
}
