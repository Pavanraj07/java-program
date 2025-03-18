package NumberLogic;

import java.util.Scanner;

public class P82_LucasNum {
    static void Lucas(int n) {
        int x=2;
        int y=1;
        for(int i=0;i<n;i++) {
            System.out.println(x+" ");
            int sum=x+y;
            x=y;
            y=sum;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("First ten Lucas Numbers are: ");
        Lucas(n);
    }
}
