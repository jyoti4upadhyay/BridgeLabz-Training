import java.util.*;
public class Unique {
	
	public static int findLen(String text) {
		int count=0;
		for(char cha:text.toCharArray()) {
			count++;
		}
		return count;
	
	}
	

	public static char[] uniqueChar(String str) {
		int len=findLen(str);
		char[]temp=new char[len];
		int index=0;
		

		for(int i=0;i<len;i++) {
			char currChar=str.charAt(i);
			boolean isUnique=true;


			for(int j=0;j<i;j++) {
				if(currChar==str.charAt(j)) {
					isUnique=false;
					break;
				}
			}
			if(isUnique) {
				temp[index]=currChar;
				index++;
			}
		}
		
        char[] result = new char[index];
        for(int i=0;i<index;i++) {
            result[i]=temp[i];
        }
        return result;
        
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		

		String str=sc.next();
		
	
		char[]unq=uniqueChar(str);
		

		for(int i=0;i<unq.length;i++) System.out.print(unq[i]+" ");
	}
}
