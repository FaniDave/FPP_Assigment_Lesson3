package Day3.Lecture;

//Employer class
public class Employer {

    //Instance fields
    private String name;
    private double salary;

    //Constructor
    public Employer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
