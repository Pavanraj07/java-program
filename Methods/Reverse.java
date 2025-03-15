package Methods;

public class Reverse {
    static int result(int x){
        int rem=0,rev=0;
        while(x>0){
            rem=x%10;
            x=x/10;
            rev=rev*10+rem;
        }
        return rev;
    }
    public static void main(String[] args) {
        int n=125369;
        System.out.println(result(n));
    }
}
