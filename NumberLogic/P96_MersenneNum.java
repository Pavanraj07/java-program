package NumberLogic;

import java.util.Scanner;

public class P96_MersenneNum {
    static int Mersene(int n){
        int res=1;
        for(int i=0;i<n;i++){
            res*=2;
            if(res-1==n)
                return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int val=Mersene(n);
        if(val==1)
            System.out.println("Mersenne Number");
        else
            System.out.println("Not a Mersenne number");
        }
}
