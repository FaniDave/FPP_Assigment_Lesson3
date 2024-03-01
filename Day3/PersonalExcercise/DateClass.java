package Day3.PersonalExcercise;

public class DateClass {

    //main method
    public static void main(String[] args) {
//        Date currentDate = new Date(); //Constructor used to create a current date
//        System.out.println(currentDate);
//        Date specifiedDate = new Date(10000); //Constructor used to create a specific date from 1/1/1970
//        System.out.println(specifiedDate);
//        specifiedDate.setTime(5000); //
//        System.out.println(specifiedDate);
//        //boolean after(Date d) boolean before(Date d) Object clone() int compareTo(Date d)
//        // boolean equals(Date d) long getTime() void setTime(long millisecs)
//        System.out.println(currentDate.after(specifiedDate));  //true
//        System.out.println(specifiedDate.before(currentDate)); //true
//        Date currentDateClone = (Date) currentDate.clone();
//        System.out.println(currentDateClone);  // Create a clone Date object of currentDate
//        System.out.println(currentDate.compareTo(currentDateClone)); //0
//        System.out.println(currentDate.equals(currentDateClone)); //true
//        System.out.println(currentDate.getTime()); //time in milliseconds


//        GregorianCalendar currentDate = new GregorianCalendar(); //Constructor used to create a current date
//        System.out.println(currentDate.getTime());
//        Date d = new Date();
//        currentDate.setTime(d);
//         System.out.println(currentDate.getTime());
//        System.out.println("*".repeat(50));
//
//        GregorianCalendar specificDate = new GregorianCalendar(2000, 8, 7); //Constructor used to create specific date
//        System.out.println(specificDate.getTime());
//        specificDate.setTime(d);
//        System.out.println(specificDate.getTime());
//
//        GregorianCalendar gc = new GregorianCalendar(2000, Calendar.AUGUST, 7, 23, 10, 00);
//        System.out.println(gc.getTime());
//
//        GregorianCalendar gcc = new GregorianCalendar(2000, Calendar.AUGUST, 7);
//        System.out.println(gcc.getTime());
//        int year = gcc.get(Calendar.YEAR);
//        int month = gcc.get(Calendar.DATE);
//        int day = gcc.get(Calendar.DAY_OF_WEEK);
//        System.out.println(year + "/ " + month + "/ " + day);

//        LocalDate currentDate = LocalDate.now(); // current date and time in yyyy-month-day
//        System.out.println(currentDate);
//        LocalDate specificTime = LocalDate.of(2000, 8, 7); // specific date and time in yyyy-month-day
//        System.out.println(specificTime);
//
//        // String date ----> LocalDate (Parsing)
//        String dateFormmatOne = "MM/dd/yyyy";
//        String dateInString = "08/07/2000";
//        LocalDate dateInLocalDate = LocalDate.parse(dateInString, DateTimeFormatter.ofPattern(dateFormmatOne));
//        System.out.println(dateInLocalDate);
//
//        System.out.println("*".repeat(50));
//
//        //LocalDate ----> String date (Formmating)
//        String dateFormatTwo = "MM/dd/yyyy";
//        LocalDate dateInLocalDateX = LocalDate.of(2000, 8, 7);
//        String dateInStringX = dateInLocalDateX.format(DateTimeFormatter.ofPattern(dateFormatTwo));
//        System.out.println(dateInStringX);

//        //Gregorian Calendar to LocalDate
//        GregorianCalendar gc = new GregorianCalendar(2000, Calendar.AUGUST + 1, 7);
//        int year = gc.get(Calendar.YEAR);
//        int month = gc.get(Calendar.MONTH);
//        int date = gc.get(Calendar.DATE);
//        LocalDate ld = LocalDate.of(year, month, date);
//        System.out.println(ld);
//
//        //LocalDate to Gregorian Calendar
//        LocalDate localDate = LocalDate.of(2000, 8, 7);
//        int yearr = localDate.getYear();
//        int monthh = localDate.getMonthValue();
//        int datee = localDate.getDayOfMonth();
//        GregorianCalendar gcc = new GregorianCalendar(yearr, monthh - 1, datee);
//        System.out.println(gcc.getTime());

    }
}
