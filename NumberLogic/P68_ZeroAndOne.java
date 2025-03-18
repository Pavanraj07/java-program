package NumberLogic;

import java.util.Scanner;

public class P68_ZeroAndOne {
    static void result(int n){
        int count0=0,count1=0;
        while(n>0){
            int rem=n%10;
            n/=10;
            if(rem==0)
                count0++;
            else if(rem==1)
                count1++;
        }  
        System.out.println("Number of Zeros are:"+count0);
        System.out.println("Number of Ones are:"+count1);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        result(n);
    }
}
