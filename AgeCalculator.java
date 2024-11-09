import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        //  to take input
        Scanner scanner = new Scanner(System.in);

        // birthdate
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String birthdateString = scanner.nextLine();

        // string to a LocalDate object
        LocalDate birthdate = LocalDate.parse(birthdateString);

        // Getting current date
        LocalDate currentDate = LocalDate.now();

        //  period between the birthdate and the current date
        Period period = Period.between(birthdate, currentDate);

        // Output the age in years, months, and days
        System.out.println("Your age is: " + period.getYears() + " years, " + period.getMonths() + " months, and " + period.getDays() + " days.");

        scanner.close();
    }
}
