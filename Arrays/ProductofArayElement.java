package Arrays;

import java.util.Scanner;

public class ProductofArayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n=sc.nextInt();
        int mul=1;
        
        System.out.println("Enter Array elements:");
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        
        System.out.println("Product is:");
        for(int i=0;i<n;i++)
            mul=mul*a[i];

        System.out.print(mul+" ");
    }
}
