import java.util.*;
public class FindNonRepeatingchar {

	public static char FirstNonRepeating(String str) {
		int[]freq=new int[256];		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			freq[ch]++;
		}
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(freq[ch]==1) return ch;
		}
		return ' ';
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		

		String str=sc.next();
		
		char res=FirstNonRepeating(str);
		
	
		if(res==' ') System.out.println("No non-repeating character found");
		else System.out.println("First non-repeating character is: "+res);
		sc.close();
	}
}
