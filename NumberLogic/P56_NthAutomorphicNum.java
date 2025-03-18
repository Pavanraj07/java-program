package NumberLogic;

import java.util.Scanner;

public class P56_NthAutomorphicNum {
    static int AutomorphicNumber(int n){
        int rem=0,res=0,i,mul=1;
        int square=n*n;
        for(i=0;i<n;i++){
            rem=square%10;
            square/=10;
            res+=rem*mul;
            mul*=10;
            if(res==n)
                break;
        }
        return (res==n)?res:0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n= sc.nextInt();

        System.out.println("Automorphic number is:");
        int res=0 , i=0;
        while(n>0){
            res=AutomorphicNumber(i);
            if(res!=0)
                n--;
            i++;
        }
        System.out.println(res);
    }
}
