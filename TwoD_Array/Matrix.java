package TwoD_Array;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size:");
        int m=sc.nextInt();
        System.out.println("Enter the column size:");
        int n=sc.nextInt();
        int k=1;

        // int [][] a={{1,2,3,4},{5,6,7,8},{10,11,12,13}};
        int[][] a=new int[m][n];
        for(int i=0;i<m;i++ ){
            for(int j=0;j<n;j++){
                a[i][j]=k++;
            }
        }
        for(int i=0;i<m;i++ ){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
