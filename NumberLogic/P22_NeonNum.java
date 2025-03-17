package NumberLogic;

public class P22_NeonNum {
    static void neonnumber(int n){
        int square=n*n;
        int sum=0;
        while(square>0){
            int rem=square%10;
            square/=10;
            sum+=rem;
        }
        if(sum==n)
            System.out.println("Neon number");
        else    
            System.out.println("Not a neon number");

    }
    public static void main(String[] args) {
        int n=4;
        neonnumber(n);
    }
}
