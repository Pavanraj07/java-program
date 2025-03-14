package Methods;

import java.util.Scanner;

public class FirstNum {
    static int remove(int x){
        // int num=0;
        while(x>9){
            // num=x%10;
            x=x/10;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=sc.nextInt();
        System.out.println("Result is:"+remove(a));
    }
}
