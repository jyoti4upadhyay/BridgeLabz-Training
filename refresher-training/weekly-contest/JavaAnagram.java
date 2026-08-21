import java.util.*;
public class JavaAnagram {

    static boolean isAnagram(String a, String b) {
        int[] arr = new int[26];

        for (int i = 0; i < a.length(); i++) {
            char ch = Character.toLowerCase(a.charAt(i));
            int ind = (ch - 'a') % 26;
            arr[ind]++;
        }

        for (int i = 0; i < b.length(); i++) {
            char ch = Character.toLowerCase(b.charAt(i));
            int ind = (ch - 'a') % 26;
            arr[ind]--;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.println(isAnagram(a, b));
    }
}