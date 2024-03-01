package Day3.Lecture;

public class OverloadingMethod {

    //Instance methods

    public int add(int a, int b) {
        return (a + b);
    }

    public int add(int a, int b, int c) {
        return (a + b + c);
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }

    public double add(int a, double b) {
        return a + b;
    }

    public double add(double b, double a) {
        return a + b;
    }
}
