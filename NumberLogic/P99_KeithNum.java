package NumberLogic;

import java.util.Scanner;

public class P99_KeithNum {
    static int keith(int n){
        int a=0,b=0;
        int sum=0,temp=n,count=0;
        while(temp>0){
            temp/=10;
            count++;
        }
        temp=n;
        while(temp>0){
            b=a;
            a=temp%10;
            temp/=10;
        }
        while(sum<n){
            sum=a+b;
            if(sum==n)return 1;
            a=b;
            b=sum;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if(keith(n)==1) System.out.println("Keith number");
        else System.out.println("Not a keith number");
    }
}
