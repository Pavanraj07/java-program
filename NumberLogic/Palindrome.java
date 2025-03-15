package NumberLogic;

public class Palindrome {
    static int reverse(int x){
        int rev=0,temp=x;
        while(x>0){
            int rem=x%10;
            x=x/10;
            rev=rev*10+rem;
        }
        System.out.println("Reversed number is:"+rev);
        return (temp==rev)?1 : 0;
    }
    public static void main(String[] args) {
        int n=12211;
        System.out.println("Number is:"+n);
        if(reverse(n)==1)
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }
}
