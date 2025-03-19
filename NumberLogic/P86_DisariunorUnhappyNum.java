package NumberLogic;

import java.util.Scanner;

public class P86_DisariunorUnhappyNum {
    static void disarium(int n){
        int j=0, sum = 0, val = n;
        while( val > 0 ) {
            val /= 10;
            j++;
        }
        val = n;
        while(n > 0) {
            int rem = n % 10;
            int temp = rem;
            for(int i=j; i>1; i--) 
                rem = rem * temp;
            sum += rem;
            j--;
            n /= 10;
        }
        System.out.println(val==sum ? " Disarium Number" : "Not a Disarium Number");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        disarium(n);
    }

}
