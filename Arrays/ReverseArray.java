package Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n=sc.nextInt();
        
        System.out.println("Enter Array elements:");
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        int temp=0 , left=0 , right=n-1;
        System.out.println("Reversed Array elements are");
        while(left<right){
            temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
            
    }
}
