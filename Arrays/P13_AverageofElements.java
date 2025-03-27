package Arrays;

import java.util.Scanner;

public class P13_AverageofElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n=sc.nextInt();
        int sum=0,avg=0;
        
        System.out.println("Enter Array elements:");
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        
        System.out.println("Average is:");
        for(int i=0;i<n;i++)
            sum=sum+a[i];

        for(int i=0;i<n;i++){
            avg=sum/n;
        }
        System.out.print(avg+" ");
    }
}
