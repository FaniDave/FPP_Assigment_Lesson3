package Day3.Lecture;

class OrderOfExecution {

    OrderOfExecution(int x) {
        System.out.println("One Argument Constructor");
    }

    OrderOfExecution() {
        System.out.println("No Argument Constructor");
    }

    static {
        System.out.println("First static init");
    }

    {
        System.out.println("First instance init");
    }

    {
        System.out.println("Second instance init");
    }
    static {
        System.out.println("Second static init");
    }

}

public class InstanceInitializer {

    //main method
    public static void main(String[] args) {
        new OrderOfExecution();
        new OrderOfExecution(8);


    }
}
