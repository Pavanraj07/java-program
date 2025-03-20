package NumberLogic2;

import java.util.Scanner;

public class P111_ReplaceZerowithone {
    static int reverse(int x){
        int n = 1, res = 0;
        while(x>0){
            int rem=x%10;
            x=x/10;
            if(rem==0)
                rem=1;
            res = res +(n * rem);
            n *= 10;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        int val=reverse(n);
        System.out.println(val);
    }
}
