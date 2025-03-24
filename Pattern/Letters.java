package Pattern;

public class Letters {
    public static void main(String[] args) {
        int n=15;

        for(int i=0;i<n;i++){
            for(int j=-0;j<n;j++){
                // A:if(j==0 || i==0 ||  j==n-1 || i==n/2)
                // B:if(j==0 || i==0 || j==n-1|| i==n-1 || i==n/2)
                // C:if(j==0 || i==0 || i==n-1)
                // D:if(j==0 || i==0 || i==n-1 || j==n-1)
                // E:if(j==0 || i==0 || i==n-1 || i==n/2)
                // F:if(j==0 || i==0 || i==n/2)
                // G:if(i==0 || j==0 || i==n-1 && (j<n/2) || j==n/2&& (i>n/2) || i==n/2 && (j>n/2) || j==n-1 &&(i>n/2) )
                // H:if(j==0 || j==n-1 || i==n/2)
                // I:if(i==0 || i==n-1 || j==n/2)
                // J:if(i==0 || j==n/2 || i-j==n/2)
                // K:if(j==0 || i+j==n/2 || i-j==n/2)
                // L:if(j==0 || i==n-1)
                // M:if(i-j==0 && (i<n/2)|| j==0 || j==n-1 || i+j==n-1 && (j>n/2) || i+j==n-1 && i-j==0)
                // N:if(j==0 || j==n-1 || i-j==0)
                // O:if(i==0 || j==0 || j==n-1 || i==n-1)
                // P:if(j==0 || i==0 || i==n/2 || j==n-1 && (i<n/2))
                // Q:if(i==0 || j==0 && (i<n-2) || j==n-1 &&(i<n-2) || i==(3*n)/4   ||  i-j==0 && (j>n/2) || i+j==n-1 && i-j==0)
                // R:if(j==0 || i==0 || i==n/2 || j==n-1 && (i<n/2) || i-j==0 && (j>n/2))
                // S:if(i==0 || j==0 && (i<n/2) || j==n-1 && (i>n/2) || i==n-1 || i==n/2)
                // T:if(i==0 || j==n/2)
                // U:if(j==0 || i==n-1 || j==n-1)
                // V:if(i-j==0 && (i<n/2)||  i+j==n-1 && (j>n/2)) 
                // W:if(i-j==0 && (i>n/2) || i+j==n-1 && (j<n/2) || j==0 || j==n-1 || i+j==n-1 && i-j==0 )
                // X:if(i-j==0 || i+j==n-1)
                // Y:if(i-j==0 && (i<n/2)|| i+j==n-1)
                if(i==0 || i==n-1 || i+j==n-1)
                    System.out.print("*");
                else   
                    System.out.print(" ");
            }
            System.out.println();
        }
    
    }  
}

