package NumberLogic;

public class P27_PronicNum {
    static void pronic(int n){
        int mul=0;
        for(int i=0;i<=n/2;i++){
            mul=i*(i+1);
            if(mul==n)
                break;
        }
        if(mul==n)
            System.out.println("Pronic number");
        else
            System.out.println("Not a pronic number");
    }
    public static void main(String[] args) {
        int n=2;
        pronic(n);
    }
}
