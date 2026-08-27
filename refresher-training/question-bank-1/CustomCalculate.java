import java.util.*;


abstract class Calculator{
    abstract int add(int a,int b);

}
class Adder extends Calculator{

    @Override
    public int add(int a,int b){
        return (a+b);
    }

}
class Multiplier{
    Adder adder;
    Multiplier(Adder adder){
        this.adder=adder;
    }
    public int multiply(int a,int b){

        int result=0;
        for(int i=0;i<b;i++){
            result=adder.add(result,a);
        }
        return result;
    }
}
class CustomCalculate{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        Adder adder=new Adder();
        System.out.println(adder.add(a,b));
        Multiplier mul=new Multiplier(adder);
        System.out.println(mul.multiply(a,b));
    }
}

