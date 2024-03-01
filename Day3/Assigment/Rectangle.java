package Day3.Assigment;


//Rectangle class
final class Rectangle {

    //Instance fields
    private final double width;
    private final double length;

    //Constructor
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    //getters
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    //Instance fields
    public double computeArea() {
        return width * length;
    }
}
