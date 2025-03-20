package BitManipulation;

import java.util.Scanner;

public class ClearithBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Enter i:");
        int i=sc.nextInt();

        int temp=0;
        int res=n>>i;
        if((res &1)==1)
            temp = 1<<i;
            int val=n | temp;
        System.out.println(val);
    }
}
