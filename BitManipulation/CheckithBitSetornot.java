package BitManipulation;

import java.util.Scanner;

public class CheckithBitSetornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print("Enter i: ");
        int i = sc.nextInt();
        int res=n>>i;
        if((res &1)==1)System.out.println("Set bit");
        else System.out.println("Not set bit");
    }
}
