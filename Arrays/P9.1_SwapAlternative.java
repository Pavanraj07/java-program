package Arrays;

import java.util.Scanner;

public class Program9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n=sc.nextInt();
        
        System.out.println("Enter Array elements:");
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        
        int[] b=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                b[j]=a[i];
                j++;
            }
        }

        for(int i=0;i<n;i++){
            if(i%2!=0){
                b[j]=a[i];
                j++;
            }
        }
        System.out.println("Result:");
        for(int i=0;i<n;i++)
            System.out.print(b[i]+" ");
    }
}
