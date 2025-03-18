package NumberLogic;

import java.util.Scanner;

public class P52_NthStrongNum {
    static int StrongNumber(int n){
        int rem=0,res,sum=0;
        int temp=n;
        while(n>0){
            rem=n%10;
            n=n/10;
            res=fact(rem);
            sum=sum+res;
        }
        return (temp==sum)?sum:0;
           
    }
    static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n= sc.nextInt();

        System.out.println("strong number is:");
        int res=0 , i=0;
        while(n>0){
            res=StrongNumber(i);
            if(res!=0)
                n--;
                i++;
        }
        System.out.println(res);
    }
}
