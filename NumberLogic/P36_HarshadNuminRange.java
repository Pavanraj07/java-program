package NumberLogic;

public class P36_HarshadNuminRange {
    static int harshadnumber(int n){
        int sum=0,rem=0;
        int temp=n;
        while(n>0){
            rem=n%10;
            n/=10;
            sum=sum+rem;
        }
        return (temp%sum==0)?temp:0;
           
    }
    public static void main(String[] args) {
        int n=18;
        System.out.println("Harshad numbers are:");
        for(int i=1;i<=n;i++){
            int res=harshadnumber(i);
            if(res!=0)System.out.print(res+" ");
        }
    }
}
