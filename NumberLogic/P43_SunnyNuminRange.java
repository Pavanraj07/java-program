package NumberLogic;

public class P43_SunnyNuminRange {
    static int sunnynumber(int n){
        int flag = 0;
        for(int i=2; i<=n/2; i++) {
            if(i*i == n) {
                flag = 1;
                break;
            }
        }  
        return (flag == 1)?n:0 ;
    }
    public static void main(String[] args) {
        int n=100;
        System.out.println("sunny numbers are:");
        for(int i=0;i<=n;i++){
            int res=(sunnynumber(i+1));
            if(res!=0)System.out.print(res-1+" ");
        }
}
}
