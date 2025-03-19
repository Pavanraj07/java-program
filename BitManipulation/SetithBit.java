package BitManipulation;

import java.util.Scanner;

public class SetithBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter i: ");
        int i = sc.nextInt();

        int temp = 0;
        temp = 1<<i;
        int res = n|temp;
        System.out.println(res);
    }
}
