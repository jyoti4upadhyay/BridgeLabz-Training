import java.util.Scanner;
public class Pallindrome {

    public int findcount(int num){
        if(num==0){
            return 1;
        }
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;

    }
    public int[] digitarr(int digit){
        digit=Math.abs(digit);
        String str=String.valueOf(digit);
        int[] digits=new int[str.length()];
        for(int i=0;i<str.length();i++){
            digits[i]=str.charAt(i)-'0';
        }
        return digits;

    }
    public int[] reverse(int[] arr){
        int revarr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            revarr[i]=arr[arr.length-1-i];
        }
        return revarr;


    }
    public boolean compare(int[] digitarr,int[] revarr){
        for(int i=0;i<revarr.length;i++){
            if(digitarr[i]!=revarr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int number=sc.nextInt();
        Pallindrome pallin=new Pallindrome();
        int count_result=pallin.findcount(number);
       
        int[] digits_result=pallin.digitarr(number);
        int[] revarr_result=pallin.reverse(digits_result);
        boolean compare_result=pallin.compare(digits_result,revarr_result);
        if(compare_result){
            System.out.println("It's a pallindrome");
        }
        else{
            System.out.println("It's not a pallindrome");
        }

    }

    
}
