package Pattern;

import java.util.Scanner;

public class PrintNumberPattern {
    public static void main(String[] args) {
        int n=10;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number:");
        char ch=sc.next().charAt(0);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                switch(ch){
                    case '0':
                        if(i==0 || j==0 || j==n-1 || i==n-1)
                            System.out.print("*");
                        else   
                            System.out.print(" ");
                        break;
                    case '1':
                        if(j==n/2 || i==n-1 || i+j==n/2)
                            System.out.print("*");
                        else   
                            System.out.print(" ");
                        break;
                    case '2':
                        if(i==0 || i==n-1 || i==n/2 || j==0 &&(i>n/2) || j==n-1 &&(i<n/2))
                            System.out.print("*");
                        else   
                            System.out.print(" ");
                        break;
                    case '3':
                        if(i==0 || i==n-1 || j==n-1 || i==n/2)
                            System.out.print("*");
                        else   
                            System.out.print(" ");
                        break;
                    case '4':
                        if(j==n/2 || i==n/2 || i+j==n/2)
                            System.out.print("*");
                        else   
                            System.out.print(" ");
                        break;
                    case '5':
                        if(i==0 || i==n-1 || i==n/2 || j==0 &&(i<n/2) || j==n-1 &&(i>n/2))
                            System.out.print("*");
                        else   
                            System.out.print(" ");
                        break;
                    case '6':
                        if(i==0 || j==0 || i==n-1 || i==n/2 || j==n-1 &&(i>(n/2)))
                            System.out.print("*");
                        else   
                            System.out.print(" ");
                        break;
                    case '7':
                        if(i==0 || j==n-1)
                            System.out.print("*");
                        else   
                            System.out.print(" ");
                        break;
                    case '8':
                        if(i==0 || j==0 || j==n-1 || i==n-1 || i==n/2)
                            System.out.print("*");
                        else   
                            System.out.print(" ");
                        break;
                    case '9':
                        if(i==0 || j==n-1 || i==n/2 || j==0 && (i<n/2) )
                            System.out.print("*");
                        else   
                            System.out.print(" ");
                        break;
                    
                    default:
                        System.out.println(" ");
                        break;
                }
            }
            System.out.println();
        }
    }
}


