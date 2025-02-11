import java.util.Optional;

public class Exo5 {
    public static void main(String[] args) {
        int number = 40;

        Optional<Integer> optionalNumber = Optional.ofNullable(number != 0 ? number : null);

        int result = optionalNumber.orElse(42);
    }
}
