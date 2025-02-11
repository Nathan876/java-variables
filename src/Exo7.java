public class Exo7 {
    public static void main(String[] args) {
        String word = "quarante-deux";
        char[] myArray42 = word.toCharArray();
        int myArray42Len = 0;
        for (char letter : myArray42) {
            myArray42Len++;
        }
        System.out.println(myArray42Len);
    }
}
