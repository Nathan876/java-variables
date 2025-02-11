
import java.text.MessageFormat;

public class Exo4 {
    public static void main(String[] args) {
        String my42count = "quarante-deux";
        int mycount = my42count.length();
        String result = "Le nombre de caractères de {0} est de {1} caractères.";
        String alternative = MessageFormat.format(result, my42count, mycount);
        System.out.println(alternative);
    }
}
