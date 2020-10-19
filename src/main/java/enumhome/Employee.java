package enumhome;

import java.time.LocalDate;

public class Employee {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private double monthlyEarnings;
    private JobPosition jobPosition;

    public Employee(String firstName, String lastName, LocalDate dateOfBirth, double monthlyEarnings, JobPosition jobPosition) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.monthlyEarnings = monthlyEarnings;
        this.jobPosition = jobPosition;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public double getMonthlyEarnings() {
        return monthlyEarnings;
    }

    public JobPosition getJobPosition() {
        return jobPosition;
    }

    @Override
    public String toString() {
        return "Our new employee is named " +
                firstName + '\'' +
                 lastName + '\'' +
                ", his date Of Birth is " + dateOfBirth +
                " monthly he will earn" + monthlyEarnings + " Euro " +
                " he will be hired as a " + jobPosition ;
    }
}
