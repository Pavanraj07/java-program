package NumberLogic;

import java.util.Scanner;

public class P80_LychrelNum {
    static int reverseNumber(int n) {
        int rev = 0;
        while (n > 0) {
            int rem=n%10;
            n /=10;
            rev=rev*10+rem;
        }
        return rev;
    }
    static int Palindrome(int n) {
        int rev=0, temp=n;
        while (n > 0) {
            int rem=n%10;
            n /=10;
            rev=rev*10+rem;
        }
        return (temp==rev)? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        int flag=0;
        for(int i=0;i<n;i++) {
            n=n+reverseNumber(n);
            if(Palindrome(n)==1) {
                flag++;
                break;
            }
        }

        System.out.println((flag == 0) ? "Lychrel Number" : "Not a Lychrel Number");
    }
}
