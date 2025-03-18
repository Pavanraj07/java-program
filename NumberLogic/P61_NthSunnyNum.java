package NumberLogic;

import java.util.Scanner;

public class P61_NthSunnyNum {
    static int sunnynumber(int n){
        int flag = 0;
        for(int i=2; i<=n/2; i++) {
            if(i*i == n) {
                flag = 1;
                break;
            }
        }  
        return ((flag == 1)?n:0) ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n= sc.nextInt();

        System.out.println("Sunny number is:");
        int res=0 , i=0;
        while(n>0){
            res=sunnynumber(i);
            if(res !=0)
                n--;
            i++;
        }
        System.out.println(res-1);
    }
}
