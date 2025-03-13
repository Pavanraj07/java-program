import java.util.Scanner;

public class AreaofSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side");
        float a=sc.nextInt();
        double area=a*a;
        System.out.println("area is:"+area);
    }
}

