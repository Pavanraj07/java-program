package NumberLogic;

import java.util.Scanner;

public class P65_NthEvilNum {
    static boolean evil(int n){
        int count=0;
        while(n>0){
            n=n&(n-1);
            count++;
        }
        return count%2==0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n= sc.nextInt();

        System.out.println("Evil number is:");
        int res=0 , i=0,count=0;
        while(count<n){
            if (evil(i)) {  
                res = i;     
                count++;
            }
            i++;
        }
        System.out.println(res);
    }
}
