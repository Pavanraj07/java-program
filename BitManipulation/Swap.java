package BitManipulation;

import java.util.Scanner;

public class Swap {
    static void swap(int m,int n){
        m=m^n;
        n=m^n;
        m=m^n;
        System.out.println("After Swapping:");
        System.out.println("m: "+m);
        System.out.println("n: "+n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m:");
        int m=sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        swap(m,n);
    }
}
