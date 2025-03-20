package NumberLogic2;

import java.util.Scanner;

public class P124_QuadraticRoot {
    static int root(int a,int b,int c){
        int res=0;
        res=((b*b)-(4*a*c));
        return res;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        System.out.println("Enter c:");
        int c=sc.nextInt();
        int val=root(a,b,c);
        if(val>0)
            System.out.println("Distict real roots");
        else if(val<0)
            System.out.println("Complex roots");
        else
            System.out.println("One real and repeated root");
    }
}
