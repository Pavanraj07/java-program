package NumberLogic;

import java.util.Scanner;

public class P62_NthDisarium {
    static int disarium(int n){
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
        return (val==sum) ? val : 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n= sc.nextInt();

        System.out.println("Disarium number is:");
        int res=0 , i=0;
        while(n>0){
            res=disarium(i);
            if(res !=0)
                n--;
            i++;
        }
        System.out.println(res);
    }
}
