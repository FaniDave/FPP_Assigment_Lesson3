package Day3.Assigment;

import java.time.LocalDate;
import java.time.Period;


//HearRates class
public class HeartRates {

    //Instance fields
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    //Constructor
    public HeartRates(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    //Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    //Instance methods
    public int calculateAge() {
        LocalDate today = LocalDate.now();
        Period period = Period.between(dateOfBirth, today);
        return period.getYears();
    }

    public int calculateMaxHeartRate() {
        int age = calculateAge();
        return 220 - age;
    }

    public void calculateAndPrintTargetHeartRateRange() {
        int restingHeartRate = 70;
        int maxHeartRate = calculateMaxHeartRate();
        int averageHeartRate = maxHeartRate - restingHeartRate;
        double lowerBoundary = 0.5;
        double upperBoundary = 0.85;
        double lowerBoundaryTargetHeartRate = (averageHeartRate * lowerBoundary) + restingHeartRate;
        double upperBoundaryTargetHeartRate = (averageHeartRate * upperBoundary) + restingHeartRate;

        System.out.println("Target Heart Rate Range:");
        System.out.println("Lower Boundary: " + lowerBoundaryTargetHeartRate + " bpm");
        System.out.println("Upper Boundary: " + upperBoundaryTargetHeartRate + " bpm");
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\n" +
                "Date of Birth: " + dateOfBirth + "\n" +
                "Age: " + calculateAge() + " years" + "\n" +
                "Maximum Heart Rate: " + calculateMaxHeartRate() + " bpm";
    }
}