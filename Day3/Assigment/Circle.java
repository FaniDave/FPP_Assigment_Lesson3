package Day3.Assigment;

//Circle class
final class Circle {

    //Instance fields
    private final double radius;

    //Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    //getter
    public double getRadius() {
        return radius;
    }

    //Instance method
    public double computeArea() {
        return Math.PI * radius * radius;
    }
}
