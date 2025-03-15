package NumberLogic;

public class CountDigit {
    static int result(int x){
        int rem=0, count=0;
        while(x>0){
            rem = x%10;
            x = x/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n=12345;
        System.out.println(result(n));
    }
}
