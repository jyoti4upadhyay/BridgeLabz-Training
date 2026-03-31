import java.util.Scanner;
public class NumberChecker {
    public int FindCount(int num){
        int count=0;
        while(num!=0){
            count++;
            num=num/10;
        }
        return count;
    }
    public int [] digitArr(int num,int count){
        int digit[]=new int[count];
        for(int i=0;i<count;i++){
            int rem=num%10;
            digit[i]=rem;
            num=num/10;
        }
        return digit;
    }
    public boolean checkDuckNum(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                return true;
            }
        }
        return false;
    }
    public boolean checkarmStrong(int number,int count){
        int arm_result=0;
        while(count>0){
            int rem_val=number%10;
            arm_result=arm_result+(int)Math.pow(rem_val,count);
            number=number/10;
            count--;
        }
        if(arm_result==number){
            return true;
        }
        else{
            return false;
        }

    }
    public int[] largest(int[] arrOfDigit){
        int largenum=Integer.MIN_VALUE;
        int secondlargenum=Integer.MIN_VALUE;
        for(int i=0;i<arrOfDigit.length;i++){
            if(arrOfDigit[i]>largenum){
                largenum=arrOfDigit[i];
            }
        }
        for(int j=0;j<arrOfDigit.length;j++){
            if(arrOfDigit[j]>secondlargenum && arrOfDigit[j]<largenum){
                secondlargenum=arrOfDigit[j];
            }
        }

        return new int[]{largenum ,secondlargenum};

    }
     public int[] smallest(int[] arrOfDigit){
        int smallnum=Integer.MAX_VALUE;
        int secondsmallnum=Integer.MAX_VALUE;
        for(int i=0;i<arrOfDigit.length;i++){
            if(arrOfDigit[i]<smallnum){
                smallnum=arrOfDigit[i];
            }
        }
        for(int j=0;j<arrOfDigit.length;j++){
            if(arrOfDigit[j]<secondsmallnum && arrOfDigit[j]>smallnum){
                secondsmallnum=arrOfDigit[j];
            }
        }

        return new int[]{smallnum,secondsmallnum};

    }

    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number=sc.nextInt();
        NumberChecker numcheck=new NumberChecker();
        int count_result=numcheck.FindCount(number);
        int[] digitarr=numcheck.digitArr(number, count_result);
        boolean ducknum_result= numcheck.checkDuckNum(digitarr);
        boolean armstrong_result=numcheck.checkarmStrong(number,count_result);

    }

}




