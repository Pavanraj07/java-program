package NumberLogic;

import java.util.Scanner;

public class P58_NthNeonNum {
    static int neonnumber(int n){
        int square=n*n;
        int sum=0;
        while(square>0){
            int rem=square%10;
            square/=10;
            sum+=rem;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n= sc.nextInt();

        System.out.println("Neon number is:");
        int res=0 , i=0;
        while(n>0){
            res=neonnumber(i);
            if(res == i)
                n--;
            i++;
        }
        System.out.println(res);
    }
}
