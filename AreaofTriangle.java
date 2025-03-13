import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base");
        float b=sc.nextInt();
        System.out.println("Enter the Height");
        float h=sc.nextInt();
        double area=0.5*b*h;
        System.out.println("area is:"+area);
        

        
    }
}

