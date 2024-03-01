package Day3.Assigment;

import java.util.Scanner;

public class Main3 {

    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter C for circle : ");
        System.out.println("Enter R for Rectangle : ");
        System.out.println("Enter T for Triangle : ");

        String holder = sc.nextLine().toUpperCase();
        double area = 0.0;

        if (holder.equals("C")) {
            System.out.println("Please Enter the radius : ");
            double radius = sc.nextDouble();
            Circle c = new Circle(radius);
            area = c.computeArea();
            System.out.println("The area of circle is : " + area);
        } else if (holder.equals("R")) {
            System.out.println("Please Enter the width : ");
            double width = sc.nextDouble();
            System.out.println("Please Enter the length : ");
            double length = sc.nextDouble();
            Rectangle r = new Rectangle(width, length);
            area = r.computeArea();
            System.out.println("The area of Rectangle is : " + area);
        } else if (holder.equals("T")) {
            System.out.println("Please Enter the base : ");
            double base = sc.nextDouble();
            System.out.println("Please Enter the height : ");
            double height = sc.nextDouble();
            Triangle t = new Triangle(base, height);
            area = t.computeArea();
            System.out.println("The area of Triangle is : " + area);
        }
        sc.close();
    }
}
