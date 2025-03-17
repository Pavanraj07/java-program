package NumberLogic;

public class P16_PerfectNum {
    static void PerfectNumber(int n){
        int sum=0;
        int temp=n;
        for(int i=1;i<n;i++){
            if(n%i==0)
                sum+=i;
        }
        if(temp==sum)
            System.out.println("perfect Number");
        else
            System.out.println("Not perfect Number");
    }
    public static void main(String[] args) {
        int n=28;
        PerfectNumber(n);
    }
}
