package NumberLogic;

public class P30_palindromeRange {
    static int reverse(int n){
        int rev=0,temp=n;
        while(n>0){
            int rem=n%10;
            n=n/10;
            rev=rev*10+rem;   
    }
        return (temp==rev)?temp : 0;
    }
    public static void main(String[] args) {
        int n=121;
        System.out.println("Number is:"+n);
        for(int i=0; i<=n; i++) {
            int res = reverse(i);
            if(res != 0 ) System.out.print(res+" ");
        }
    }
}
