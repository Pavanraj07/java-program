package NumberLogic;

import java.util.Scanner;

public class P74_2ndSmallestNum {
    static int MaxDigit(int n){
        int rem=0,min=10;
        int secondSmall=10;
        while(n>0){
            rem=n%10;
            n=n/10;
            if(rem<min){
                int temp=rem;
                secondSmall=min;
                min=temp;
            }
            else if(rem<secondSmall && rem>min)
                secondSmall=rem;
               
        }
        return secondSmall;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();

        System.out.println("2nd Max digit is:"+MaxDigit(n));
    }
}
