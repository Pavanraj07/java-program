package Basics;
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum += i;
        }
        System.out.println("Sum of" +n+ "natural number is:"+sum);

    }
}
