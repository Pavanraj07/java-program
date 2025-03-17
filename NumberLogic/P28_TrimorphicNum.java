package NumberLogic;

public class P28_TrimorphicNum {
    static void trimophic(int n){
        int rem=0,res=0,i,mul=1;
        int cube=n*n*n;
        for(i=0;i<n;i++){
            rem=cube%10;
            cube/=10;
            res+=rem*mul;
            mul*=10;
            if(res==n)
                break;
        }
        if(res==n)
            System.out.println("Trimorphic Number");
        else  
            System.out.println("not Trimorphic Number");

    }
    public static void main(String[] args) {
        int n=25;
        trimophic(n);
    }
}
