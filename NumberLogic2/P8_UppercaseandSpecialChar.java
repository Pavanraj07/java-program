package NumberLogic2;

import java.util.Scanner;

public class P8_UppercaseandSpecialChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
        char ch=sc.next().charAt(0);

        int temp=ch;
        if(temp>=65 && temp<=90)
            System.out.println(ch+" is Uppercase letter");
        else if(temp>=97 && temp<=122)
            System.out.println(ch+" is Lowercase letter");
        else if((temp>=35 && temp<=47) || (temp>=58 && temp<=64) || (temp>=91 && temp<=96) || (temp>=123 && temp<=126))
            System.out.println(ch+" is Special Character");
        else
            System.out.println("Neither a uppercase nor a special character ");
    }
}
