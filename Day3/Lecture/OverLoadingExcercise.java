package Day3.Lecture;

public class OverLoadingExcercise {

    //Instance methods
    void printSomething() {
        System.out.println("Something");
    }

    //1
    void printSomething(String fN, String lN) {
        System.out.println(fN + lN);
    }

    //2
    void printSomething(String fN) {
        System.out.println(fN);
    }

    //3
    void printSomething(int age, String fN) {
        System.out.println("Name : " + fN);
        System.out.println("Age : " + age);
    }

    //4
    String printSomething(String fN, int age) {
        return "Name : " + fN + " Age: " + age;
    }

    //5
    int printSomething(int age) {
        return age;
    }
}
