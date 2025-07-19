import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        // a Predicate that checks if a string's length is greater than 5
        Predicate<String> isLong = str -> str.length() > 5;

        System.out.println("Is 'Hello' long? " + isLong.test("Hello"));

        System.out.println("Is 'Predicate' long? " + isLong.test("Predicate"));
    }
}
