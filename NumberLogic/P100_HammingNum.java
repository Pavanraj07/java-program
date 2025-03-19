package NumberLogic;

import java.util.Scanner;

public class P100_HammingNum {
    static int hamming(int n){
        if(n==0) 
            return 0;
        while(n%2==0)n/=2;
        while(n%3==0)n/=3;
        while(n%5==0)n/=5;
        
        return (n==1)?n:0;   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("First "+n+" hamming numbers are:");
        for(int i=0;i<40;i++){
            int res=hamming(i);
            if(res!=0)System.out.println(i+" ");
        }
    }
}
