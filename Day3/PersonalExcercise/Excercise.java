package Day3.PersonalExcercise;

public class Excercise {

          //Fields
          private static int counter = 0;

          //Constructor
          public Excercise () {
               counter++;
          }

          //getter
          public int getCounter () {
               return counter;
          }

          //main method
          public static void main(String[] args) {
              Excercise e = null;
              for(int i = 0; i < 10; i++) {
                  e = new Excercise();
              }
              System.out.println(e.getCounter());
          }
}
