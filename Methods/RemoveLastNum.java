package Methods;

import java.util.Scanner;

public class RemoveLastNum {
    static int remove(int x){
        int n=0;
        n= x/10;
        return n;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        int c=remove(a);
        
        System.out.println("Result is:"+c );
    }
}
