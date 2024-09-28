import java.util.Scanner;

public class Task11 {

    private static int isVowel(String s) {
        String tempS = s.toLowerCase();

        int vowelCount = 0;

        for (int i = 0; i < tempS.length(); i++) {

            if (tempS.charAt(i) == 'a' || tempS.charAt(i) == 'e' || tempS.charAt(i) == 'i' || tempS.charAt(i) == 'o'
                    || tempS.charAt(i) == 'u') {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    private static int isConsonant(String s) {
        String tempS = s.toLowerCase();

        int consonantCount = 0;

        for (int i = 0; i < tempS.length(); i++) {

            boolean con1 = tempS.charAt(i) >= 'b' && tempS.charAt(i) <= 'd';
            boolean con2 = tempS.charAt(i) >= 'f' && tempS.charAt(i) <= 'h';
            boolean con3 = tempS.charAt(i) >= 'j' && tempS.charAt(i) <= 'n';
            boolean con4 = tempS.charAt(i) >= 'p' && tempS.charAt(i) <= 't';
            boolean con5 = tempS.charAt(i) >= 'v' && tempS.charAt(i) <= 'z';

            if (con1 || con2 || con3 || con4 || con5) {
                consonantCount++;
            }
        }
        return consonantCount;
    }

    private static int vowelConsonantSum(String[] s) {
        String[] names = s;
        String allNamesCombined = "";

        for (int i = 0; i < names.length; i++) {
            allNamesCombined += names[i];
        }
        allNamesCombined = allNamesCombined.toLowerCase();

        System.out.println(allNamesCombined);

        return isVowel(allNamesCombined) + isConsonant(allNamesCombined);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = "The quick brown fox jumps over the lazy dog.";
        String[] names = { "Bob", "Alice", "Max", "Marry", "Rosy" };

        System.out.println(isVowel(sentence));
        System.out.println(isConsonant(sentence));
        System.out.println(vowelConsonantSum(names));

    }
}