package Day3.PersonalExcercise;

//Month which has enumrated type
enum Month {
    JAN,
    FEB,
    MAR,
    APR,
    MAY,
    JUN,
    JUL,
    AUG,
    SEP,
    OCT,
    NOV,
    DEC
}

public class EnumratedTypes {

    //main method
    public static void main(String[] args) {
        Integer x = 10;
        int result = x.compareTo(12);
        System.out.println(result);

        for (Month m : Month.values()) {
            System.out.println(m.name() + " (" + (m.ordinal() + 1) + ")");
        }
    }
}
