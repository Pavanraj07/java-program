import java.util.Scanner;

public class Palindrome {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
    int rev=0 , rem = 0;
    int x=n;
    while(n>0){
        rem=n%10;
        n=n/10;
        rev= rev * 10+rem;
    }
    if(x==n)
        System.out.println("Palindrome");
    else 
        System.out.println("not palindrome");
        
}
