package NumberLogic;

public class P41_SpyNuminRange {
    static int spynumber(int n){
        int rem=0,sum=0,mul=1;
        int temp=n;
        while(n>0){
            rem=n%10;
            n=n/10;
            sum+=rem;
            mul*=rem;
        }
        return (sum==mul)?temp:0;
    }
    public static void main(String[] args) {
        int n=1124;
        for(int i=0;i<=n;i++){
            int res=spynumber(i);
            if(res!=0)System.out.print(res+" ");
        }
    }
}
