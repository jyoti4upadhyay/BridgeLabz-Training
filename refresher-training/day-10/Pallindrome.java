import java.util.*;
public class Pallindrome {
	public static boolean checkPalindrome(String str) {
		int start=0;
		int end=str.length()-1;
		

		while(start<end) {
			if(str.charAt(start)!=str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	

	public static boolean checkPalindromeRecursion(String str,int start,int end) {
		
		if(start>=end) return true;
		
		if(str.charAt(start)!=str.charAt(end)) return false;
		
		return checkPalindromeRecursion(str,start+1,end-1);
	}
	
	public static char[] reverseString(String str) {
		char[]rev=new char[str.length()];
		int idx=0;
		
		for(int i=str.length()-1;i>=0;i--) {
			rev[idx]=str.charAt(i);
			idx++;
		}
		return rev;
	}
	
	public static boolean checkPalindromeArray(String str) {

		char[]originalarr=str.toCharArray();
		char[]revarr=reverseString(str);
	
		for(int i=0;i<originalarr.length;i++) if(originalarr[i]!=revarr[i]) return false;
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		

		String str=sc.next();
		
		// Check palindrome using three methods
		boolean res1=checkPalindrome(str);
		boolean res2=checkPalindromeRecursion(str,0,str.length()-1);
		boolean res3=checkPalindromeArray(str);
		
		// Display result
		System.out.println("Palindrome check using loop: "+res1);
		System.out.println("Palindrome check using recursion: "+res2);
		System.out.println("Palindrome check using array: "+res3);
		
		sc.close();
	}
}
