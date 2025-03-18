package NumberLogic;

import java.util.Scanner;

public class P66_ReverseNumRecursion {
    static int Reverse(int n) {
        if(n<10)
            return n;
        int rem=1 , temp=n;
        while(n>=10){
            rem*=10;
            n/=10;   
        }
        return (temp%10)*rem + Reverse(temp/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        System.out.println("Reversed number is:"+Reverse(n));
    }
}