package Arrays;

import java.util.Scanner;

public class MaxandMinNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n=sc.nextInt();
        int i=0;
        
        System.out.println("Enter Array elements:");
        int[] a = new int[n];
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        
        System.out.println("Array elements are:");
        int min=a[0] , max=a[n-1];
        for(i=0;i<n;i++){
            if(a[i]>max)
                max=a[i];
            if(a[i]<min)
                min=a[i];
        }
        System.out.println("Max: "+max);
        System.out.print("Min :"+min);
    }
}
