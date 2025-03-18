package NumberLogic;

import java.util.Scanner;

public class P71_SmallestDigit {
    static int MinDigit(int n){
        int rem=0,min=1;
        while(n>0){
            rem=n%10;
            n=n/10;
            if(rem<min)
                min=rem;
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();

        System.out.println("Min digit is:"+MinDigit(n));
    }
}
