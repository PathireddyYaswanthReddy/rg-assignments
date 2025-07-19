import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Yasawnth", "Bhanu", "Ravi");

        System.out.println("Before sorting using lambda expression");
        System.out.println(names);

        names.sort((a,b) -> a.compareTo(b));

        System.out.println("After sorting using lambda expression");
        System.out.println(names);

    }
}