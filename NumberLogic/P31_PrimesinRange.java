package NumberLogic;

public class P31_PrimesinRange {
    static int prime(int x){
        int flag=0;
        for(int i=2;i<x/2 ; i++){
            if(x%i==0){
                flag=1;
                break;
            }
        }
        return (flag == 0)?x:0;
    }
    public static void main(String[] args) {
        int n=10;
        for(int i=2;i<=n;i++){
            int res=prime(i);
            if(res!=0)System.out.println(res+" ");
        }
}
}
