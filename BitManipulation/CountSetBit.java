package BitManipulation;

import java.util.Scanner;

public class CountSetBit {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number: ");
    int n = sc.nextInt();

    int temp= n ,count=0;
    while(n>0){
        // if((temp&1)==1)count++;
        // temp=n>>1;
        // n=n>>1;
        n=n&(n-1);
        count++;
    }
    System.out.println("Count of Set bit is:"+count);
    }

}
