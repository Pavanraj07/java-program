import java.util.Scanner;

public class AreaofRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length");
        float l=sc.nextInt();
        System.out.println("Enter the breadth");
        float h=sc.nextInt();
        double area=l*h;
        System.out.println("area is:"+area);
        
    }
}

