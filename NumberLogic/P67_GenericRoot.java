package NumberLogic;

import java.util.Scanner;

public class P67_GenericRoot {
    static int add(int n){
        int rem=0,sum=0;
        while(n>0){
            rem=n%10;
            n=n/10;
            sum+=rem;
        }
        return (sum>9)? add(sum):sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        System.out.println("Generic root is:"+add(n));
    }
}
