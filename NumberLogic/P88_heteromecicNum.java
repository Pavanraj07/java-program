package NumberLogic;

import java.util.Scanner;

public class P88_heteromecicNum {
    static void hetero(int n){
        int mul=0;
        for(int i=0;i<=n/2;i++){
            mul=i*(i+1);
            if(mul==n)
                break;
        }
        if(mul==n)
            System.out.println("Pronic number");
        else
            System.out.println("Not a pronic number");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        hetero(n);
    }
}
