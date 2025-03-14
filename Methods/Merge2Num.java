package Methods;
import java.util.Scanner;

public class Merge2Num {
    static int merge(int x,int y){
        int a=y;
        while(y>0){
            x=x*10;
            y=y/10;
        }
        x=x+a;
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int m = sc.nextInt();
        System.out.println("Enter second number:");
        int n = sc.nextInt();
        System.out.println("Result is:"+merge(m,n));
    }
}
