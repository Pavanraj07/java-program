package NumberLogic2;

import java.util.Scanner;

public class P122_SeatsinTheatre {
    static int fact(int n){
        if(n==0 || n==1)return 0;
        int f=1;
        for (int i=2;i<=n;i++) {
            f*=i;
        }
        return f;
    }
    static int Permutation(int n,int r){
        int x=fact(n);
        int y=fact(n-r);
        return x/y;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        System.out.println("Enter r:");
        int r=sc.nextInt();

        if(r>n)System.out.println("Not possible");
        else{
            int res=Permutation(n, r);
            System.out.println(n+" people can occupy "+r+" seats in theatre is :"+res);
        }
    }
}
