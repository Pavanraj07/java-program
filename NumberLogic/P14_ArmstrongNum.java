package NumberLogic;

public class P14_ArmstrongNum {
    static void Armstrongnumber(int n){
        int rem=0,res,sum=0;
        int temp=n;
        while(n>0){
            rem=n%10;
            n=n/10;
            res=cube(rem);
            sum=sum+res;
        }
        if(temp==sum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");; 
    }
    static int cube(int n){
        return n*n*n;
    }
    public static void main(String[] args) {
        int n=1370;
        Armstrongnumber(n);
    }
}
