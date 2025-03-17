package NumberLogic;

public class P34_StrongNuminRange {
    static int StrongNumber(int n){
        int rem=0,res,sum=0;
        int temp=n;
        while(n>0){
            rem=n%10;
            n=n/10;
            res=fact(rem);
            sum=sum+res;
        }
        return (temp==sum)?sum:0;
           
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
        System.out.println("Strong numbers are:");
        for(int i=0;i<=n;i++){
            int res=StrongNumber(i);
            if(res!=0)System.out.println(res+" ");
        }
    }
}
