package NumberLogic;

public class P9_FactorialNum {
    static int Fact(int x){
        if(x==1)return 1;
        else return x*Fact(x-1);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(Fact(n));
    }
}
