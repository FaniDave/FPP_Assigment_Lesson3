package Day3.Assigment;

import java.time.LocalDate;
import java.util.Scanner;

public class Main2 {

    //main method
    public static void main(String[] args) {

        //Get input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Please Enter your last name: ");
        String lastName = scanner.nextLine();

        AgeCalculator ageCalculator = new AgeCalculator();
        LocalDate dateOfBirth = ageCalculator.getBirthday();

        HeartRates heartRates = new HeartRates(firstName, lastName, dateOfBirth);

        System.out.println();
        heartRates.calculateAndPrintTargetHeartRateRange();
        System.out.println();
        System.out.println(heartRates.toString());
    }
}
