package NumberLogic;

import java.util.Scanner;

public class P69_Sum {
    static int add(int m,int n){
        while(n>0){
            int sum= m^n;
            int carry=(m&n)<<1;
            m=sum;
            n=carry;
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m: ");
        int m = sc.nextInt();

        System.out.println("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Sum is:"+add(m,n)); 
    }
}
