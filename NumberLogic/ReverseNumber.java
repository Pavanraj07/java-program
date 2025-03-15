package NumberLogic;

public class ReverseNumber {
    static int reverse(int x){
        int rev=0;
        while(x>0){
            int rem=x%10;
            x=x/10;
            rev=rev*10+rem;
        }
        return rev;
    }
    public static void main(String[] args) {
        int n=12345;
        System.out.println(reverse(n));
    }
}
