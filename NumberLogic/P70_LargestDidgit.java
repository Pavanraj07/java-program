package NumberLogic;

import java.util.Scanner;

public class P70_LargestDidgit {
    static int MaxDigit(int n){
        int rem=0,max=0;
        while(n>0){
            rem=n%10;
            n=n/10;
            if(rem>max)
                max=rem;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();

        System.out.println("Max digit is:"+MaxDigit(n));
    }
}
