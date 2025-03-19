package NumberLogic2;

import java.util.Scanner;

public class P106_Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
        char ch=sc.next().charAt(0);

        int temp=ch;
        if((temp>=65 && temp<=90) || (temp>=97 && temp<=122))
            System.out.println("It is Alphabet");
        else
            System.out.println("Not alphabet");

    }
}
