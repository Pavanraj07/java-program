package NumberLogic2;

import java.util.Scanner;

public class P4_DecimaltoBinary {
    static void DecimaltoBinary(int n){
        if (n == 0) {
            return ;  
        }
        DecimaltoBinary(n/2);
        System.out.print(n%2); 
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter m:");
        int n=sc.nextInt();
        if(n==0)
            System.out.println(0);
        else
            DecimaltoBinary(n);
        
    }
}
