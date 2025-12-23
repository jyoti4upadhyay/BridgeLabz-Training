import java.util.*;
public class Anagram {
	public static boolean checkAnagram(String str1,String str2) {
		
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		int[]freq1=new int[256];
		int[]freq2=new int[256];
		
		for(int i=0;i<str1.length();i++) {
			char ch=str1.charAt(i);
			freq1[ch]++;
		}
		for(int i=0;i<str2.length();i++) {
			char ch=str2.charAt(i);
			freq2[ch]++;
		}
		
		for(int i=0;i<256;i++) {
			if(freq1[i]!=freq2[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter first string: ");
		String str1=sc.next();
		System.out.print("Enter second string: ");
		String str2=sc.next();

		boolean result=checkAnagram(str1,str2);
        
		if(result) System.out.println("The strings are anagrams");
		else System.out.println("The strings are not anagrams");
		sc.close();
	}
}