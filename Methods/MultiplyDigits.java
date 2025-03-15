package Methods;

public class MultiplyDigits {
    static int product(int x){
        int rem=0 ,mul=1;
        while(x>0){
            rem=x%10;
            x=x/10;
            mul=mul*rem;
        }
        return mul;
    }
    public static void main(String[] args) {
        int n=125369;
        System.out.println(product(n));
    }
}
