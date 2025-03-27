package Arrays;

import java.util.Scanner;

public class P14_CountOccurances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n=sc.nextInt();
        
        System.out.println("Enter Array elements:");
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
            
        int count=0;
        System.out.println("Enter the target:");
        int target=sc.nextInt();

        for(int i=0;i<n;i++){
            if(a[i]==target)
                count++;
        }
        System.out.println("Count is:"+count);
    }
}
