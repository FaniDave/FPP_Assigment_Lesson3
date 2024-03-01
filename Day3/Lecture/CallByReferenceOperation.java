package Day3.Lecture;

public class CallByReferenceOperation {

    //Instance variables
    int data = 50;

    //Instance methods
    void change (int data) {
        this.data += 100 + data; //
        System.out.println(data); // 200
    }

    //main method
    public static void main(String[] args) {
        CallByValueOperation callByValue = new CallByValueOperation();
        System.out.println(callByValue.data);  // 50
        callByValue.change(callByValue.data);  // 200 call by reference
        System.out.println(callByValue.data); //50
    }
}
