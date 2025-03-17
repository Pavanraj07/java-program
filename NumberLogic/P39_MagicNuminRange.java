package NumberLogic;

public class P39_MagicNuminRange {
    static int MagicNumber(int n){
        int sum = 0;
        while(n > 0) {
            int rem = n % 10;
            n /= 10;
            sum += rem;
        }
        return (sum >9) ?MagicNumber(sum):sum;
    }
    public static void main(String[] args) {
        int n=19;
        System.out.println("Magic Numbers are:");
        for(int i=1;i<=n;i++){
            int res = MagicNumber(i);
            if(res==1)System.out.print(i+" ");
        }
        
    }
}
