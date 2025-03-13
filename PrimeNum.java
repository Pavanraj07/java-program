import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int flag=0, i;
        for(i=2;i<=n/2;i++){
            if(n%i==0){
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println("not Prime number");
        else
            System.out.println("Prime Number");
    }
}
