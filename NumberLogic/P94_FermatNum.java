package NumberLogic;

import java.util.Scanner;

public class P94_FermatNum {
    static long fermat(long n){
        long pw=1;
        for(int i=0;i<n;i++) {
            pw*=2;
        }
        long res=1;
        for(int i=0;i<pw;i++){
            res*=2;
        }
        return (res+1);
    }
    // static long power(long x,long y){
    //     long res = 1;
    //     for (long i=0;i<y;i++) {
    //         res *= x; 
    //     }
    //     return res;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        long n = sc.nextInt();
        for (int i=0;i<=n;i++) {
            System.out.println(fermat(i));
        }
    }
}