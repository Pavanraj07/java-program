package NumberLogic2;

import java.util.Scanner;

public class P2_PowerUsingRecursion {
    static int result(int m,int n){
        if(n==0) {
            return 1; 
        }
        return m*result(m,n-1); 
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter m:");
        int m=sc.nextInt();
        System.out.println("Enter n:");
        int n=sc.nextInt();
        System.out.println(result(m,n));
    }
}
