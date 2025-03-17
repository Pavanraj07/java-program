package NumberLogic;

public class P32_PerfectSquarinrange {
    static int PerfectSquare(int n){
        int i,flag=0;
        for(i=2;i<=n/2;i++){
            if(i*i==n)
                flag=1;
        }
        return (flag==1)?n:0;
    }
    public static void main(String[] args) {
        int n=100;
        for(int i=0;i<=n;i++){
            int res=PerfectSquare(i);
            if(res!=0) System.out.println(res+" ");
        }
    }
}
