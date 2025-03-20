package NumberLogic2;

import java.util.Scanner;

public class P126_Multipleof3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        if(n%3==0)System.out.println("Multiple of 3");
        else System.out.println("Not multiple of 3");
    }
}
