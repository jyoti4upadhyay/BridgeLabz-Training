import java.util.Scanner;

public class LexicalTwist {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter first word");
        String firstWord= sc.nextLine();

        if (firstWord.contains(" ")) {
            System.out.println(firstWord + " is invalid word");
            return;
        }

        System.out.println("Enter the second word");
        String secWord = sc.nextLine();

        String w1 = firstWord.toLowerCase();
        String w2 = secWord.toLowerCase();

        String reverse = new StringBuilder(w1).reverse().toString();

        if (reverse.equals(w2)) {
            String result = reverse.replaceAll("[aeiou]", "@");
            System.out.println(result);
        } else {
            String find = (firstWord + secWord).toUpperCase();

            int v= countVowels(find);
            int c= countConsonants(find);

            if (v > c) {
                print2UniqueVowels(find);
            } else if (c> v) {
                print2UniqueConsonants(find);
            } else {
                System.out.println("Vowels and consonants are equal");
            }
        }

        sc.close();
    }

    private static int countVowels(String s) {
        int flagV= 0;
        for (char ch : s.toCharArray()) {
            if ("AEIOU".indexOf(ch) != -1) flagV++;
        }
        return flagV;
    }

    private static int countConsonants(String s) {
        int flagC = 0;
        for (char ch : s.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z' && "AEIOU".indexOf(ch) == -1) flagC++;
        }
        return flagC;
    }

    private static void print2UniqueVowels(String s) {
        String out = "";
        for (char ch : s.toCharArray()) {
            if ("AEIOU".indexOf(ch) != -1 && out.indexOf(ch) == -1) {
                out += ch;
            }
            if (out.length() == 2) break;
        }
        System.out.println(out);
    }

    private static void print2UniqueConsonants(String s) {
        String out = "";
        for (char ch : s.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z' &&
                "AEIOU".indexOf(ch) == -1 &&
                out.indexOf(ch) == -1) {
                out += ch;
            }
            if (out.length() == 2) break;
        }
        System.out.println(out);
    }
}