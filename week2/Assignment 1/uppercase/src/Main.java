import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Yaswanth", "Bhanu", "Ravi");

        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase) // converts each to uppercase
                .collect(Collectors.toList());

        System.out.println("Uppercase Names: " + upperCaseNames);
    }
}
