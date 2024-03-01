package Day3.PersonalExcercise;

public class StaticVariables {

          //Static variables
          private static int counter = 0;

          //Constructor
          public StaticVariables () {
               counter++;
          }

          //getter
          public int getCounter () {
               return counter;
          }

          //main method
          public static void main(String[] args) {
              StaticVariables sv = null;
              for(int i = 0; i < 10; i++) {
                   sv = new StaticVariables();
              }
              System.out.println(sv.getCounter());
          }
}
