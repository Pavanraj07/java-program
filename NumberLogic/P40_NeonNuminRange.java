package NumberLogic;

public class P40_NeonNuminRange {
    static int neonnumber(int n){
        int square=n*n;
        int sum=0;
        while(square>0){
            int rem=square%10;
            square/=10;
            sum+=rem;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=100;
        System.out.println("Neon numbers are:");
        for(int i=0;i<=n;i++){
            int res=neonnumber(i);
            if(res == i)System.out.println(res+" ");
        }
    }
}
