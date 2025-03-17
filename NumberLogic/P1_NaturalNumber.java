package NumberLogic;

public class P1_NaturalNumber {
    static int add(int x){
        int i,sum=0;
        for(i=0;i<=x;i++)
            sum=sum+i;
        
        return sum;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(add(n));
    }
}
