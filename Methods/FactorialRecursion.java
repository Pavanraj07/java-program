package Methods;

public class FactorialRecursion {
    static int factorial(int x){
        if(x==1)
            return 1;
        else
            return x*factorial(x-1);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(factorial(n));
    }
}
