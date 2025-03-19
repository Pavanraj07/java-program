package NumberLogic;

import java.util.Scanner;

public class P87_HarshadNumorNot {
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
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        harshadnumber(n);
    }
}
