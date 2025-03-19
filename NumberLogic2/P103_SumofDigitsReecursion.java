package NumberLogic2;

import java.util.Scanner;

public class P103_SumofDigitsReecursion {
    static int SumogDigit(int n){
        int rem=0,sum=0;
        if(n>0){
            rem=n%10;
            n=n/10;
            sum=sum+rem;
            return rem+SumogDigit(n);
        }
        else
            return sum;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter m:");
        int n=sc.nextInt();
        System.out.println(SumogDigit(n));
    }
}
