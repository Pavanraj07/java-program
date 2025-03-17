package NumberLogic;

public class P15_StrongNum {
    static void StrongNumber(int n){
        int rem=0,res,sum=0;
        int temp=n;
        while(n>0){
            rem=n%10;
            n=n/10;
            res=fact(rem);
            sum=sum+res;
        }
        if(temp==sum)
            System.out.println("strong Number");
        else
            System.out.println("Not strong Number");
    }
    static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        int n=145;
        StrongNumber(n);
    }
}
