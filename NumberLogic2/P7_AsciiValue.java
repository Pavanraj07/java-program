package NumberLogic2;

import java.util.Scanner;

public class P7_AsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
        char ch=sc.next().charAt(0);

        int temp=ch;
        System.out.println("ASCII value is:");
        System.out.println(temp);
    }
}
