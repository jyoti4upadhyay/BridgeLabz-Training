import java.util.Scanner;
public class DigitArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your number");
        int num=sc.nextInt();
        int maxInt=10;
        int[] digitarr=new int[maxInt];
        int ind=0;
        while(num>0){
            if(ind>maxInt-1){
                int[] temp=new int[maxInt*2];

                for(int i=0;i<maxInt;i++){
                    temp[i]=digitarr[i];
                }
                digitarr=temp;
                maxInt=maxInt*2;
            }

                digitarr[ind]=num%10;
                num=num/10;
                ind++;
            }
        int largest=digitarr[0];
        for(int i=0;i<digitarr.length;i++){
            if(digitarr[i]>largest){
                largest=digitarr[i];
            }

        }
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<digitarr.length;i++){
            if(digitarr[i]>secondLargest && digitarr[i]<largest){
                secondLargest=digitarr[i];
            }

        }
        System.out.println("Largest digit is "+largest+" second largest digit is "+secondLargest);



    }
    
}
