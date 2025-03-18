package NumberLogic;

import java.util.Scanner;

public class P73_2ndLargestNum {
    static int MaxDigit(int n){
        int rem=0,max=0;
        int secondLarge=0;
        while(n>0){
            rem=n%10;
            n=n/10;
            if(rem>max){
                int temp=rem;
                secondLarge=max;
                max=temp;
            }
            else if(rem>secondLarge && rem<max)
                secondLarge=rem;
               
        }
        return secondLarge;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();

        System.out.println("2nd Max digit is:"+MaxDigit(n));
    }
}
