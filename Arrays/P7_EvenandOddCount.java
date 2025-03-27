package Arrays;

import java.util.Scanner;

public class P7_EvenandOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n=sc.nextInt();
        
        System.out.println("Enter Array elements:");
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        
        int EvenCount=0 , OddCount=0;
        System.out.println("Array elements are");
        for(int i=0;i<n;i++){
            if(a[i]%2==0)
                EvenCount++;
            else OddCount++;
        }
        System.out.println("Even count is:"+EvenCount);
        System.out.println("Odd count is:"+OddCount);
    }
}
