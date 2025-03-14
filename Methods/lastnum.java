package Methods;

import java.util.Scanner;

public class lastnum {
    static int remove(int x){
        int num=0;
        num= x%10;
        return num;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        int c=remove(a);
        
        System.out.println("Result is:"+c );
    }
}
