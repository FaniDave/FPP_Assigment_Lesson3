package Day3.Assigment;

//Triangle class
final class Triangle {

    //Instance fields
    private final double base;
    private final double height;

    //Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    //getters
    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    //Instance fields
    public double computeArea() {
        return 0.5 * base * height;
    }
}
