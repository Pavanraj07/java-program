package NumberLogic;

import java.util.Scanner;

public class P64_NthTrimorphic {
    static int trimorphic(int n){
        int rem=0,res=0,i,mul=1;
        int cube=n*n*n;
        for(i=0;i<n;i++){
            rem=cube%10;
            cube/=10;
            res+=rem*mul;
            mul*=10;
            if(res==n)
                break;
        }
        return (res==n)?res : 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n= sc.nextInt();

        System.out.println("trimorphic number is:");
        int res=0 , i=0;
        while(n>0){
            res=trimorphic(i);
            if(res !=0)
                n--;
            i++;
        }
        System.out.println(res);
    }
}
