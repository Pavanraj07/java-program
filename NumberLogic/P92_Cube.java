package NumberLogic;

import java.util.Scanner;

public class P92_Cube {
    static void cube(int n){
        int i,flag=0;
        for(i=1;i<=n/2;i++){
            if(i*i*i==n)
                flag=1;
        }
        if(flag==1)
            System.out.println("Number is cube");
        else    
            System.out.println("Number is not cube");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        cube(n); 
    }
}
