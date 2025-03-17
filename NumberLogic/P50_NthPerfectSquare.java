package NumberLogic;

import java.util.Scanner;

public class P50_NthPerfectSquare {
    static int PerfectSquare(int n) {
        int flag = 0;
        for(int i=0; i<=n; i++) {
            if(i*i == n) {
                flag = 1;
                break;
            }
        }
        return (flag != 0) ? n : -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Perfect Square Number is: ");
        int res = 0, i = 0;
        while(n>0) {
            res = PerfectSquare(i);
            if(res != -1) 
                n--;
            i++;
        }
        System.out.println(res);
    }
}