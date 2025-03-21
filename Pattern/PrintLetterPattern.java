package Pattern;
import java.util.Scanner;

public class PrintLetterPattern {
    public static void main(String[] args) {
        int n=10;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Letter:");
        char ch=sc.next().charAt(0);

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                switch(ch){
                    case 'A':
                        if(j==0 || i==0 ||  j==n-1 || i==n/2)
                            System.out.print("*");
                        else   
                            System.out.print(" ");
                        break;
                    case 'B':
                        if(j==0 || i==0 || j==n-1|| i==n-1 || i==n/2)
                            System.out.print("*");
                        else   
                            System.out.print(" ");
                        break;
                    case 'C':
                        if(j==0 || i==0 || i==n-1)
                            System.out.print("*");
                        else   
                            System.out.print(" ");
                        break;
                    case 'D':
                        if(j==0 || i==0 || i==n-1 || j==n-1)
                            System.out.print("*");
                        else   
                            System.out.print(" ");
                        break;
                    case 'E':
                        if(j==0 || i==0 || i==n-1 || i==n/2)
                            System.out.print("*");
                        else   
                            System.out.print(" ");
                        break;
                    case 'F':
                        if(j==0 || i==0 || i==n/2)
                            System.out.print("*");
                        else   
                            System.out.print(" ");
                        break;
                    case 'G':
                        if(i==0 || j==0 || i==n-1 && (j<n/2) || j==n/2&& (i>n/2) || i==n/2 && (j>n/2) || j==n-1 &&(i>n/2) )
                            System.out.print("*");
                        else   
                            System.out.print(" ");
                        break;
                    case 'H':
                        if(j==0 || j==n-1 || i==n/2)
                            System.out.print("*");
                        else   
                            System.out.print(" ");
                        break;
                    case 'I':
                        if(i==0 || i==n-1 || j==n/2)
                            System.out.print("*");
                        else   
                            System.out.print(" ");
                        break;
                    case 'J':
                        if(i==0 || j==n/2 || i-j==n/2)
                            System.out.print("*");
                        else   
                            System.out.print(" ");
                        break;
                    case 'K':
                        if(j==0 || i+j==n/2 || i-j==n/2)
                            System.out.print("*");
                        else   
                            System.out.print(" ");
                        break;
                    case 'L':
                        if(j==0 || i==n-1)
                            System.out.print("*");
                        else   
                            System.out.print(" ");
                        break;
                    case 'M':
                        if(i-j==0 && (i<n/2)|| j==0 || j==n-1 || i+j==n-1 && (j>n/2) || i+j==n-1 && i-j==0)
                            System.out.print("*");
                        else   
                            System.out.print(" ");
                        break;
                    case 'N':
                        if(j==0 || j==n-1 || i-j==0)
                            System.out.print("*");
                        else   
                            System.out.print(" ");
                        break;
                    case 'O':
                        if(i==0 || j==0 || j==n-1 || i==n-1)
                            System.out.print("*");
                        else   
                            System.out.print(" ");
                        break;
                    case 'P':
                        if(j==0 || i==0 || i==n/2 || j==n-1 && (i<n/2))
                            System.out.print("*");
                        else   
                            System.out.print(" ");
                        break;
                    case 'Q':
                        if(i==0 || j==0 && (i<n-2) || j==n-1 &&(i<n-2) || i==(3*n)/4   ||  i-j==0 && (j>n/2) || i+j==n-1 && i-j==0)
                            System.out.print("*");
                        else   
                            System.out.print(" ");
                        break;
                    case 'R':
                        if(j==0 || i==0 || i==n/2 || j==n-1 && (i<n/2) || i-j==0 && (j>n/2))
                            System.out.print("*");
                        else   
                            System.out.print(" ");
                        break;
                    case 'S':
                        if(i==0 || j==0 && (i<n/2) || j==n-1 && (i>n/2) || i==n-1 || i==n/2)
                            System.out.print("*");
                        else   
                            System.out.print(" ");
                        break;
                    case 'T':
                        if(i==0 || j==n/2)
                            System.out.print("*");
                        else   
                            System.out.print(" ");
                        break;
                    case 'U':
                        if(j==0 || i==n-1 || j==n-1)
                            System.out.print("*");
                        else   
                            System.out.print(" ");
                        break;
                    case 'V':
                        if(i-j==0 && (i<n/2)||  i+j==n-1 && (j>n/2)) 
                            System.out.print("*");
                        else   
                            System.out.print(" ");
                        break;
                    case 'W':
                        if(i-j==0 && (i>n/2) || i+j==n-1 && (j<n/2) || j==0 || j==n-1 || i+j==n-1 && i-j==0 )
                            System.out.print("*");
                        else   
                            System.out.print(" ");
                        break;
                    case 'X':
                        if(i-j==0 || i+j==n-1)
                            System.out.print("*");
                        else   
                            System.out.print(" ");
                        break;
                    case 'Y':
                        if(i-j==0 && (i<n/2)|| i+j==n-1)
                            System.out.print("*");
                        else   
                            System.out.print(" ");
                        break;
                    case 'Z':
                        if(i==0 || i==n-1 || i+j==n-1)
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
