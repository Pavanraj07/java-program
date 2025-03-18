package NumberLogic;

import java.util.Scanner;

public class P54_NthharshadNum {
    static int harshadnumber(int n){
        int sum=0,rem=0;
        int temp=n;
        while(n>0){
            rem=n%10;
            n/=10;
            sum=sum+rem;
        }
        return (temp%sum==0)?temp:0;
           
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n= sc.nextInt();

        System.out.println("Harshad number is:");
        int res=0 , i=1;
        while(n>0){
            res=harshadnumber(i);
            if(res!=0)
                n--;
                i++;
        }
        System.out.println(res);
    }
}
