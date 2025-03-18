package NumberLogic;

import java.util.Scanner;

public class P57_NthMagicNum {
    static int MagicNumber(int n){
        int sum = 0;
        while(n > 0) {
            int rem = n % 10;
            n /= 10;
            sum += rem;
        }
        return (sum >9) ?MagicNumber(sum):sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n= sc.nextInt();

        System.out.println("Magic number is:");
        int res=0 , i=0;
        while(n>0){
            res=MagicNumber(i);
            if(res==1)
                n--;
            i++;
        }
        System.out.println(i-1);
    }
}
