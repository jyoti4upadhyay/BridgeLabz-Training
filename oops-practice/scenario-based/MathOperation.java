public class MathOperation{
    static void factorial(int num){
        int fact=1;
        while(num!=1){
            fact=fact*num;
            num=num-1;
        }
        System.out.println("Factorial of number is "+fact);

    }
    static void prime(int num){
        int flag=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                flag++;
            }
        }
        if(flag!=0){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
    }

    static void gcd(int a,int b){
        if(a<0) a=-a;
        if(b<0) b=-b;

        while(b!= 0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println(a);
            
    }
    static void fibonacci(int n){
        int num1=0;
        int num2=1;
        int temp=0;
        for(int i=2;i<n;i++){
            temp=num1+num2;
            num1=num2;
            num2=temp;        
        }

        System.out.println("Fibonacci"+temp);
    }
    public static void main(String[] args) {
        factorial(5);
        factorial(-3);
        prime(7);
        prime(1);

        gcd(48, 18);
        gcd(-12, 8);

        fibonacci(7);
        fibonacci(-2);
    }


    
}