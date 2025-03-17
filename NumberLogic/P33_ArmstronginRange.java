package NumberLogic;

public class P33_ArmstronginRange {
    static int Armstrongnumber(int n){
        int rem=0,res,sum=0;
        int temp=n;
        while(n>0){
            rem=n%10;
            n=n/10;
            res=cube(rem);
            sum=sum+res;
        }
        return (temp==sum)?sum:0;
            
    }
    static int cube(int n){
        return n*n*n;
    }
    public static void main(String[] args) {
        int n=1370;
        System.out.println("Armstrong numbers are:");
        for(int i=0;i<=n;i++){
            int res=Armstrongnumber(i);
            if(res!=0) System.out.println(res+" ");
        }
    }
}
