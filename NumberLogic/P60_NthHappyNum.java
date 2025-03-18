package NumberLogic;

import java.util.Scanner;

public class P60_NthHappyNum {
    static int happynumber(int n){
        int rem=0,sum=0;
        while(n>0){
            rem=n%10;
            n=n/10;
            sum+=rem*rem;
        }
        return (sum>9)? happynumber(sum):sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n= sc.nextInt();

        System.out.println("Happy number is:");
        int res=0 , i=1;
        while(n>0){
            res=happynumber(i);
            if(res ==1)
                n--;
            i++;
        }
        System.out.println(i-1);
    }
}
