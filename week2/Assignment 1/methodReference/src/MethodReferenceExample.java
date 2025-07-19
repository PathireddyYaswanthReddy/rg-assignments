import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {

    public static boolean startsWithA(String name) {
        return name.startsWith("A");
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anu", "Ravi", "Arjun", "Yaswanth");

        // Using lambda expression
        names.stream()
                .filter(name -> startsWithA(name))
                .forEach(name -> System.out.println(name));

        // Using method reference
        names.stream()
                .filter(MethodReferenceExample::startsWithA)
                .forEach(System.out::println);
    }
}
