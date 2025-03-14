package Methods;
import java.util.Scanner;

public class FirstNum {
    static int remove(int x){
        int rem=0,count=0;
        int p=x;
        while(x>0){
            rem=x%10;
            x=x/10;
            count++;
        }
        for(int i=0;i<count-1;i++)
            rem = rem*10;
        
        return p-rem;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=sc.nextInt();
        System.out.println("Result is:"+remove(a));
    }
}
