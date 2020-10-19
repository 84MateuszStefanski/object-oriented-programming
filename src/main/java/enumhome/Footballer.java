package enumhome;

import java.time.LocalDate;

public class Footballer extends Employee{

    private double height;
    private double weight;
    private String position;
    private String betterLeg;

    public Footballer(String firstName, String lastName, LocalDate dateOfBirth, double monthlyEarnings,
                      JobPosition jobPosition, double height, double weight, String position, String betterLeg) {
        super(firstName, lastName, dateOfBirth, monthlyEarnings, jobPosition);
        this.height = height;
        this.weight = weight;
        this.position = position;
        this.betterLeg = betterLeg;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getPosition() {
        return position;
    }

    public String getBetterLeg() {
        return betterLeg;
    }

    @Override
    public String toString() {
        return super.toString() +
                " he`s height is " + height +
                ", he`s weight is " + weight +
                ", he`s favourite position is " + position + '\'' +
                ", he`s better leg is " + betterLeg + '\'' +
                '}';
    }
}
