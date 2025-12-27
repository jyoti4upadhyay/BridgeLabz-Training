import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        char[] arr1=str1.replaceAll("\\s","").toLowerCase().toCharArray();
    
        char[]arr2=str2.replaceAll("\\s","").toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2))
            System.out.println("The strings are anagrams.");
        else
            System.out.println("The strings are not anagrams.");

    }
    
}
