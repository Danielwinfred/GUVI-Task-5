import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Given list of strings
        Stream<String> names = Stream.of("abc", "d", "ef");

        // Using map() to convert each string to uppercase and collect the result into a list
        List<String> upperCaseNames = names.map(String::toUpperCase)
                .collect(Collectors.toList());

        // Print the result
        System.out.println(upperCaseNames);
    }
}

