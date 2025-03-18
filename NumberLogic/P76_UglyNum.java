package NumberLogic;

public class P76_UglyNum {
    static int uglynum(int n){
        if(n==0) 
            return 0;
        while(n%2==0)n/=2;
        while(n%3==0)n/=3;
        while(n%5==0)n/=5;
        
        return (n==1)?1:0;

        
    }
    public static void main(String[] args) {
        int n=16;
        System.out.println((uglynum(n)==1)?"Ugly number": "Not an ugly number");
    }
}
