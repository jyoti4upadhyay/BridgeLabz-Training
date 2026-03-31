import java.util.*;

public class Factor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int maxFactor=10;
        int[] factorArr=new int [maxFactor];
        int maxIndex=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                if(maxIndex==maxFactor){
                    maxFactor=2*maxFactor;
                    int[] temp=new int[maxFactor];
                    
                    for(int k=0;k<factorArr.length;k++){
                        temp[k]=factorArr[k];
                    }
                    factorArr=temp;
                }
                factorArr[maxIndex]=i;
                maxIndex++;
            }
        }
        for(int i=0;i<maxIndex;i++){
            System.out.print(factorArr[i]+ " ");
        }


    }

    
}
