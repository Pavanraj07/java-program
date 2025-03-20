package NumberLogic2;

import java.util.Scanner;

public class P109_AreaofCircle {
    static double area(int n){
        double res=0;
        res=3.142*n*n;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        System.out.println("Area of circle is:"+area(n));;
    }
}
