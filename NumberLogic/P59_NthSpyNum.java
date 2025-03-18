package NumberLogic;

import java.util.Scanner;

public class P59_NthSpyNum {
    static int spynumber(int n){
        int rem=0,sum=0,mul=1;
        int temp=n;
        while(n>0){
            rem=n%10;
            n=n/10;
            sum+=rem;
            mul*=rem;
        }
        return (sum==mul)?temp:0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n= sc.nextInt();

        System.out.println("spy number is:");
        int res=0 , i=0;
        while(n>0){
            res=spynumber(i);
            if(res !=0)
                n--;
            i++;
        }
        System.out.println(res);
    }
}
