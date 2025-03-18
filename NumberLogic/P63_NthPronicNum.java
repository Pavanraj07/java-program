package NumberLogic;

import java.util.Scanner;

public class P63_NthPronicNum {
    static int pronic(int n){
        int mul=0;
        for(int i=0;i<=n/2;i++){
            mul=i*(i+1);
            if(mul==n)
                break;
        }
        return (mul==n)?mul:0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n= sc.nextInt();

        System.out.println("pronic number is:");
        int res=0 , i=0;
        while(n>0){
            res=pronic(i);
            if(res !=0)
                n--;
            i++;
        }
        System.out.println(res);
    }
}
