import java.util.Scanner;

public class Greatestof2num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int x=sc.nextInt();
        System.out.println("Enter the second number");
        int y=sc.nextInt();
        if(x>y)
            System.out.println(""+x+"x is greater");
        else
            System.out.println(""+y+" is greater");
    }
    
}
