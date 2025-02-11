public class Exo8 {
    public static void main(String[] args) {
        String word = "quarante-deux";
        char[] myArray42 = word.toCharArray();
        String sentence = "La grande réponse sur la vie, l’univers et le reste !";
        String myArraySentence = new String(myArray42);
        String result = myArraySentence + sentence;
        System.out.println(result);
    }
}
