package NumberLogic;

import java.util.Scanner;

public class P75_CountOddandEven {
    static int EvenNum(int x){
        int count=0,rem=0;
        while(x>0){
            rem=x%10;
            x=x/10;
            if(rem%2==0){
                count++;
        }
    }
        return count;
    }
    static int OddNum(int x){
        int count=0,rem=0;
        while(x>0){
            rem=x%10;
            x=x/10;
            if(rem%2!=0){
                count++;
        }
    }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        System.out.println("Number of Even digits are:"+EvenNum(n));
        System.out.println("Number of Odd digits are:"+OddNum(n));
    }
}
