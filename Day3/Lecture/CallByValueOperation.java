package Day3.Lecture;

public class CallByValueOperation {

         //Instance variables
         int data = 50;

         //Instance methods
         void change (int data) {
               data += 100 + data; // data refers to the local variable
               System.out.println(data);
         }

         //main method
         public static void main(String[] args) {
              CallByValueOperation callByValue = new CallByValueOperation();
              System.out.println(callByValue.data);  //50
              callByValue.change(150);  //400  we pass only the value
              System.out.println(callByValue.data); //50
         }
}
