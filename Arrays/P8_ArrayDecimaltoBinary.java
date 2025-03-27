package Arrays;

import java.util.Scanner;

public class P8_ArrayDecimaltoBinary {
    static int DecimaltoBinary(int n){
        int res=0,power=1;
        while(n>0){
            int digit=n%2;
            res+=(digit*power);
            n/=2;
            power*=10;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n=sc.nextInt();
        
        System.out.println("Enter Array elements:");
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int res=0,i=0;
        System.out.println("Binary of Array elements are");
        for(i=0;i<n;i++){
            res=DecimaltoBinary(a[i]);
            a[i]=res;
        }
        for(i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}
