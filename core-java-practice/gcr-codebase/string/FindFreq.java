import java.util.*;
public class FindFreq {

	public static String[][] findFreq(String str) {
	
		int[]frq=new int[256];
		
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			frq[ch]++;
		}
		
		int count=0;
		for(int i=0;i<256;i++) {
			if(frq[i]>0) {
				count++;
			}
		}
	
		String[][]res=new String[count][2];
		int idx=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(frq[ch]>0) {
				res[idx][0]=String.valueOf(ch);
				res[idx][1]=String.valueOf(frq[ch]);
				frq[ch]=0;
				idx++;
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		String str=sc.next();
		
		
		String[][]freqarr=findFreq(str);
		
		System.out.println("Character\tFrequency");
		for(int i=0;i<freqarr.length;i++) {
			System.out.println(freqarr[i][0]+"\t\t"+freqarr[i][1]);
		}
		
		sc.close();
	}
}
