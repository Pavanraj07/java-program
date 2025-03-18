package NumberLogic;

import java.util.Scanner;

public class P77_AbunDefiPerfectNum {
    static int AbundantNumber(int n) {
        int sum = 0,i, count = 0;
        for(i=1; i<=n/2; i++) {
            if(n%i == 0) 
                sum += i;
        }
        if(sum > n) 
            count++;
        return count;
    }

    static int DeficientNumber(int n) {
        int sum = 0, count = 0;
        for(int i=1; i<=n/2; i++) {
            if(n%i == 0) 
                sum += i;
        }
        if(sum < n)  
            count++;
        return count;
    }
    static int PerfectNumber(int n) {
        int sum = 0, count=0;
        for(int i=1; i<n; i++) {
            if(n%i == 0) 
                sum += i;
        }
        if(sum == n) 
            count++;
        return count;
    }
    public  static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n: ");
    int n = sc.nextInt();

    System.out.println("Abundant Numbers are: ");
    int count1 = 0;
    for(int i=0; i<=n; i++) {
        int res = AbundantNumber(i);
        if(res == 1) {
            count1++;
        }
    }
    System.out.println(count1);

    int count2 = 0;
    System.out.println("Deficient Numbers are: ");
    for(int i=0; i<n-1; i++) {
        int res = DeficientNumber(i);
        if(res == 1) {
            count2++;
        }
    } 

    System.out.println(count2+1);
    int count3 = 0;
    System.out.println("Perfect Numbers are: ");
    for(int i=1; i<n; i++){
        int res = PerfectNumber(i);
        if(res == 1) 
            count3++;
    }
    System.out.println(count3);
    }
}
