package Arrays;

import java.util.Scanner;

public class P15_CkecjExistence {
    static int Check(int[] a,int target,int n){
        for(int i=0;i<n;i++){
            if(a[i]==target)
                return target;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n=sc.nextInt();
        
        System.out.println("Enter Array elements:");
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
            
        System.out.println("Enter the target:");
        int target=sc.nextInt();
        


        
    }
}
