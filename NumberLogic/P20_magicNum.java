package NumberLogic;

public class P20_magicNum {
    static int MagicNumber(int n){
        int sum = 0;
        while(n > 0) {
            int rem = n % 10;
            n /= 10;
            sum += rem;
        }
        return (sum >9) ? MagicNumber(sum):sum;
    }
    public static void main(String[] args) {
        int n=19;
        int res = (MagicNumber(n));
        System.out.println((res == 1) ? "It is a Magic Number" : "It is Not a Magic Number");
    }
}
