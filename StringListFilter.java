import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringListFilter {
    public static void main(String[] args) {
        // Given list of strings
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        // Using filter() to keep only non-empty strings and collect the result into a list
        List<String> nonEmptyStrings = strings.stream()
                .filter(str -> !str.isEmpty())
                .collect(Collectors.toList());

        // Print the list of non-empty strings
        System.out.println(nonEmptyStrings);
    }
}
