package NumberLogic;

public class Fact3 {
    static int Factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
}    
    static int power(int x,int n){
        int temp=x;
        while(n>1){
            x=temp*x;
            n--;
        }
        return x;
    }
    static int PowerFactorial(int x,int n){
        return power(x,n)/Factorial(n);
    }
    public static void main(String[] args) {
        int n=2,x=5;
        System.out.println("Result is:"+PowerFactorial(x,n));
    }
}
