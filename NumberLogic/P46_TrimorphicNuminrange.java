package NumberLogic;

public class P46_TrimorphicNuminrange {
    static int trimophic(int n){
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
        return (res==n)?res : 0;
    }
    public static void main(String[] args) {
        int n=100;
        System.out.println("Trimorphic numbers are:");
        for(int i=0;i<=n;i++){
             int res=trimophic(i);
             if(res!=0)System.out.print(res+" ");
        }
    }
}
