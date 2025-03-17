package NumberLogic;

public class P35_perfectNuminRange {
    static int PerfectNumber(int n){
        int sum=0;
        int temp=n;
        for(int i=1;i<n;i++){
            if(n%i==0)
                sum+=i;
        }
        return (temp==sum)?sum:0;
           
    }
    public static void main(String[] args) {
        int n=280;
        System.out.println("Perfect numbers are:");
        for(int i=0;i<=n;i++){
            int res=PerfectNumber(i);
            if (res!=0) System.out.println(res+" ");
        }
    }
}
