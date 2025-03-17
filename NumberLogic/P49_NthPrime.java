package NumberLogic;

import java.util.Scanner;

public class P49_NthPrime {
    static int prime(int n){
        int flag=0;
        for(int i=2;i<n/2 ; i++){
            if(n%i==0){
                flag=1;
                break;
            }
        }
        return (flag==0)?n:0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n= sc.nextInt();

        System.out.println("prime number is:");
        int res=0 , i=0;
        while(n>0){
            res=prime(i);
            if(res!=0)
                n--;
                i++;
        }
        System.out.println(res);
    }
}
