package NumberLogic;

public class P13_PerfectSquare {
    static void PerfectSquare(int n){
        int i,flag=0;
        for(i=2;i<=n/2;i++){
            if(i*i==n)
                flag=1;
        }
        if(flag==1)
            System.out.println("It is a Sunny number");
        else    
            System.out.println("It is not a sunny number");
    }
    public static void main(String[] args) {
        int n=8;
        PerfectSquare(n+1);
    }
}
