package NumberLogic;

public class P2_OnebyFact {
    static int Fact(int x){
        if(x==1)return 1;
        else return x*Fact(x-1);
    }
    public static void main(String[] args) {
        int n=5;
        double ans=Fact(n);
        double sum=1/ans;
        System.out.println(sum);
    }
}
