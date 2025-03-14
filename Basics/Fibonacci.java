package Basics;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of steps:");
        int step = sc.nextInt();
        int a=0 , b=1 , sum=0;
        System.out.println("Fibonacci series:");
        for(int i=0;i<=step;i++){
            System.out.println(a);
            sum=a+b;
            a=b;
            b=sum;
        }
    }
}
