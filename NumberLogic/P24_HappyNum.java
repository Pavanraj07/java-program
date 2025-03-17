package NumberLogic;

public class P24_HappyNum {
    static int happynumber(int n){
        int rem=0,sum=0;
        while(n>0){
            rem=n%10;
            n=n/10;
            sum+=rem*rem;
        }
        return (sum>9)? happynumber(sum):sum;
    }
    public static void main(String[] args) {
        int n=19;
        if(happynumber(n)==1)
            System.out.println("Happy number");
        else    
            System.out.println("Not happy number");
    }
}
