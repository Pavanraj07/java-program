package NumberLogic;

public class P17_HarshadNum {
    static void harshadnumber(int n){
        int sum=0,rem=0;
        int temp=n;
        while(n>0){
            rem=n%10;
            n/=10;
            sum=sum+rem;
        }
        if(temp%sum==0)
            System.out.println("Harshad Number");
        else    
            System.out.println("Not Harshad Number");
    }
    public static void main(String[] args) {
        int n=18;
        harshadnumber(n);
    }

}
