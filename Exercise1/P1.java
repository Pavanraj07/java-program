package Exercise1;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        int[] a=new int[n];

        for(int i=0;i<n;i++){
            a[i]=n-i;
    }
    for(int i:a){
        System.out.print(i+" ");
    }
    }
}
