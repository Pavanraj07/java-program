package Arrays;

import java.util.Scanner;

public class AddStoreSameIndex {
    static int add(int n){
        int rem=0,sum=0;
        while(n>0){
            rem=n%10;
            n/=10;
            sum+=rem;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n=sc.nextInt();
        
        System.out.println("Enter Array elements:");
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int res=0;
        System.out.println("Sum of digit of Array elements are");
        for(int i=0;i<n;i++){
            res=add(a[i]);
            a[i]=res;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
            
    }
}
