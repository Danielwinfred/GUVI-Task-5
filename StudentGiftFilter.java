import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentGiftFilter {
    public static void main(String[] args) {
        // List of student names
        List<String> students = Arrays.asList("Alice", "Bob", "Anna", "David", "Ava", "Eve", "Charlie", "Alan", "Zoe", "Aria");

        // Using Stream API and lambda expression to filter students whose names start with "A"
        List<String> studentsWithAGift = students.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        // Print the list of students who will receive special gifts
        System.out.println("Students receiving special gifts: " + studentsWithAGift);
    }
}

