package NumberLogic;

import java.util.Scanner;

public class P98_PellSeries {
    static int pell(int n){
        int a=0,b=1;
        int sum=0;
        for(int i=0;i<=n;i++){
            System.out.println(a);
            sum=2*b+a;
            a=b;
            b=sum;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("First "+n+" Pell numbers");
        pell(n);
    }
}
