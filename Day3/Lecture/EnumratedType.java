package Day3.Lecture;
enum EmnuratedType {
     SMALL, MEDIUM, LARGE
}

enum DaysOfWeek {
     MONDAY, TUESDAY, WENDSDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class EnumratedType {

    //Constants
//    public static final int SMALL = 1;
//    public static final int Medium = 2;
//    public static final int Large = 3;

    public static void main(String[] args) {
        for (EmnuratedType e : EmnuratedType.values()) {
              System.out.println(e.name() + " " + e.ordinal());
        }
        System.out.println("*".repeat(50));
        for(DaysOfWeek dow : DaysOfWeek.values()) {
             System.out.println(dow.name() + " " + dow.ordinal());
        }
    }
}

