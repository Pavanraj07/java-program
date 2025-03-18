package NumberLogic;

import java.util.Scanner;

public class P85_UnhappyNum {
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
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        if(happynumber(n)==1)
            System.out.println("Happy number");
        else    
            System.out.println("Unhappy number");
    }
}
