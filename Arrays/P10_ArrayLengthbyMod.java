package Arrays;

import java.util.Scanner;

public class P10_ArrayLengthbyMod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n=sc.nextInt();
        
        System.out.println("Enter Array elements:");
        int[] a = new int[20];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        
        int i=0;
        for(i=0;i<n;i++){
            a[i]=a.length%a[i];
            System.out.println(a[i]+" ");
        }
    }
}
