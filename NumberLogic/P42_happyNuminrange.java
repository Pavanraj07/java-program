package NumberLogic;

public class P42_happyNuminrange {
    static int happynumber(int n){
        int rem=0,sum=0;
        while(n>0){
            rem=n%10;
            n=n/10;
            sum+=rem*rem;
        }
        return (sum>9)? happynumber(sum):sum;
    }
    public static void main(String[] args) {
        int n=100;
        for(int i=0;i<=n;i++){
            int res=happynumber(i);
            if(res==1)System.out.print(i+" ");
        }
    }
}
