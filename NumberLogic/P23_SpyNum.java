package NumberLogic;

public class P23_SpyNum {
    static void spynumber(int n){
        int rem=0,sum=0,mul=1;
        while(n>0){
            rem=n%10;
            n=n/10;
            sum+=rem;
            mul*=rem;
        }
        if(sum==mul)
            System.out.println("Spy Number");
        else
            System.out.println("Not a spy number");
    }
    public static void main(String[] args) {
        int n=1124;
        spynumber(n);
    }
}
