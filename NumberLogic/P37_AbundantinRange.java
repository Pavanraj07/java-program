package NumberLogic;

public class P37_AbundantinRange {
    static int Abundantnumber(int n){
        int sum=0;
        int temp=n;
        for(int i=1;i<n;i++){
            if(n%i==0)
                sum+=i;
        }
        return (sum>temp)?temp:0;
    }
    public static void main(String[] args) {
        int n=180;
        System.out.println("Abundant numbers are:");
        for(int i=0;i<=n;i++){
            int res=Abundantnumber(i);
            if(res!=0)System.out.print(res+" ");
        }
    }
}
