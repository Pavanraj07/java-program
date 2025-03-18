package NumberLogic;

import java.util.Scanner;

public class P53_NthPerfectNum {
    static int PerfectNumber(int n){
        int sum=0;
        int temp=n;
        for(int i=1;i<n;i++){
            if(n%i==0)
                sum+=i;
        }
        return (temp==sum)?sum:0;
           
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n= sc.nextInt();

        System.out.println("Perfect number is:");
        int res=0 , i=0;
        while(n>0){
            res=PerfectNumber(i);
            if(res!=0)
                n--;
                i++;
        }
        System.out.println(res);
    }
}
