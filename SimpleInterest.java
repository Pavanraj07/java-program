import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle");
        float p=sc.nextInt();
        System.out.println("Enter the Time ");
        float t=sc.nextInt();
        System.out.println("Enter the rate of interest");
        float r=sc.nextInt();
        double SI=(p*t*r)/100;
        System.out.println("Simple interest is:"+SI);
    }
}
