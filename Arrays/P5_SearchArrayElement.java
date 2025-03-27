package Arrays;

import java.util.Scanner;

public class P5_SearchArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n=sc.nextInt();
        
        System.out.println("Enter Array elements:");
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        
        System.out.println("Search index to be searched:");
        int k=sc.nextInt();
        int index=0;
        for(int i=0;i<n;i++)
            if(a[i]==k)index=i;

        System.out.print(index+" ");
    }
}
