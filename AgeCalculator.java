import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        // Create a scanner to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their birthdate
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String birthdateString = scanner.nextLine();

        // Convert the input string to a LocalDate object
        LocalDate birthdate = LocalDate.parse(birthdateString);

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the period between the birthdate and the current date
        Period period = Period.between(birthdate, currentDate);

        // Output the age in years, months, and days
        System.out.println("Your age is: " + period.getYears() + " years, " + period.getMonths() + " months, and " + period.getDays() + " days.");

        scanner.close();
    }
}
