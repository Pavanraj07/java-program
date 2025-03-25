package Arrays;

import java.util.Scanner;

public class Initialization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n=sc.nextInt();
        
        System.out.println("Enter Array elements:");
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        
        System.out.println("Array elements are");
        for(int i=0;i<n;i++)
            System.out.println(a[i]+" ");
    }
}
