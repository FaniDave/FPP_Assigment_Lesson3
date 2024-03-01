package Day3.Lecture;

import java.util.Date;
import java.util.GregorianCalendar;

public class DateTimeApI {

         //main method
         public static void main(String[] args) {
             Date currentDate = new Date();
             System.out.println(currentDate);
             System.out.println(currentDate.getTime());

             Date specificDate = new Date (1636463553);
             System.out.println(specificDate);
             System.out.println(specificDate.getTime());

             GregorianCalendar gc = new GregorianCalendar(2020, 2, 29);
             System.out.println(gc);
             System.out.println(gc.getTime());
             System.out.println(gc.getTimeInMillis());

             GregorianCalendar gcc = new GregorianCalendar(2000, 8, 7, 4, 50, 4);

         }
}
