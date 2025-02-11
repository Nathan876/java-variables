
import java.util.Random;

public class Exo9 {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        int rand = randomNumber.nextInt(42) + 1;
        boolean result = (rand == 42);
        System.out.println("Nombre généré : " + rand);
        System.out.println("Résultat : " + result);
    }
    
}
