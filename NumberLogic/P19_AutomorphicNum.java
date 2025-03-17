package NumberLogic;

public class P19_AutomorphicNum {
    static void AutomorphicNumber(int n){
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
        if(res==n)
            System.out.println("Automorphic Number");
        else  
            System.out.println("not Automorphic Number");

    }
    public static void main(String[] args) {
        int n=76;
        AutomorphicNumber(n);
    }
}
