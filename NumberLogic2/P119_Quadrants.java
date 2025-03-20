package NumberLogic2;

import java.util.Scanner;

public class P119_Quadrants {
    static void result(int x,int y){
        if(x>0 && y>0)
            System.out.println("Points are in First quadrant");
        else if(x<0 && y>0)
            System.out.println("Points are in Second quadrant");
        else if(x<0 && y<0)
            System.out.println("Points are in Third quadrant");
        else if(x>0 && y<0)
            System.out.println("Points are in Fouth quadrant");
        else if(x==0 && y==0)
            System.out.println("Points ara at origin");

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter x:");
        int x=sc.nextInt();
        System.out.println("Enter y:");
        int y=sc.nextInt();
        result(x, y);
    }
}
