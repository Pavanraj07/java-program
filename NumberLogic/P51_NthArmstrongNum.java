package NumberLogic;

import java.util.Scanner;

public class P51_NthArmstrongNum {
    static int Armstrongnumber(int n){
        int rem=0,res,sum=0;
        int temp=n;
        while(n>0){
            rem=n%10;
            n=n/10;
            res=cube(rem);
            sum=sum+res;
        }
        return (temp==sum)?sum:0;
            
    }
    static int cube(int n){
        return n*n*n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n= sc.nextInt();

        System.out.println("Armstrong number is:");
        int res=0 , i=0;
        while(n>0){
            res=Armstrongnumber(i);
            if(res!=0)
                n--;
                i++;
        }
        System.out.println(res);
    }
}
