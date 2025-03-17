package NumberLogic;

public class P38_AutomorphicinRange {
    static int AutomorphicNumber(int n){
        int rem=0,res=0,i,mul=1;
        int square=n*n;
        for(i=0;i<n;i++){
            rem=square%10;
            square/=10;
            res+=rem*mul;
            mul*=10;
            if(res==n)
                break;
        }
        return (res==n)?res:0;
    }
    public static void main(String[] args) {
        int n=76;
        System.out.println("Automorphic numbers are:");
        for(int i=0;i<=n;i++){
            int res=AutomorphicNumber(i);
            if(res!=0)System.out.println(res+" ");
        }
    }
}
