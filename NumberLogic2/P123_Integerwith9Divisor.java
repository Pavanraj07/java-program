package NumberLogic2;

import java.util.Scanner;

public class P123_Integerwith9Divisor {
    static int divisor(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                count++;
        }
        return (count==9)?n:0;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        System.out.println("Integer which has exactly 9 divisors:");
        for(int i=1;i<n;i++) {
            int res=divisor(i);
            if(res!=0) System.out.println(res+" ");
        }
    }
}
