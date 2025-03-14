package Basics;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int rev=0 , rem = 0;
        while(n>0){
            rem=n%10;
            n=n/10;
            rev= rev * 10+rem;
        }
        System.out.println("Reversed number is:"+rev);
    }
}
