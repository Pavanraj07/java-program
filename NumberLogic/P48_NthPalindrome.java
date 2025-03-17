package NumberLogic;

import java.util.Scanner;

public class P48_NthPalindrome {
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
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n= sc.nextInt();

        System.out.println("palindrome number is:");
        int res=0 , i=0;
        while(n>0){
            res=reverse(i);
            if(res!=0)
                n--;
                i++;
        }
        System.out.println(res);
    }
}
