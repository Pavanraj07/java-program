package Pattern;

public class PrintNumberPattern {
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<n;i++){
            for(int j=-0;j<n;j++){
                // 0:if(i==0 || j==0 || j==n-1 || i==n-1)
                // 1:if(j==n/2 || i==n-1 || i+j==n/2)
                // 2:if(i==0 || i==n-1 || i==n/2 || j==0 &&(i>n/2) || j==n-1 &&(i<n/2))
                // 3:if(i==0 || i==n-1 || j==n-1 || i==n/2)
                // 4:if(j==n/2 || i==n/2 || i+j==n/2)
                // 5:if(i==0 || i==n-1 || i==n/2 || j==0 &&(i<n/2) || j==n-1 &&(i>n/2))
                // 6:if(i==0 || j==0 || i==n-1 || i==(3*n)/4 || j==n-1 &&(i>(n/2)+1))
                // 7:if(i==0 || j==n-1)
                // 8:if(i==0 || j==0 || j==n-1 || i==n-1 || i==n/2)
                if(i==0 || j==n-1 || i==n/2 || j==0 && (i<n/2) )
                    System.out.print("*");
                else   
                    System.out.print(" ");
                }
                System.out.println();
            }
    }
}
