package NumberLogic;

import java.util.Scanner;

public class P90_AmicableNum {
    static boolean Amicable(int a, int b) {
        int sum1 = 0, sum2 = 0;
        for(int i=1;i<=a/2;i++){
            if(a%i==0) 
                sum1 +=i;
        }

        for(int i=1;i<=b/2;i++){
            if(b%i==0)
                sum2 +=i;
        }

        return sum1==b && sum2==a;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        System.out.println(Amicable(a,b) ? "Amicable numbers" : "Not Amicable numbers");
    }
}
