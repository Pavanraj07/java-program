package PatternProblem.Patternset1;

public class Pattern42 {
    public static void main(String[] args) {
        int n=6 ;
        for(int i=0;i<=n;i++){
            // int count=1;
            for(int j=0;j<=n;j++){
                if(i+j>=n/2 && i-j<=n/2 && i+j<=3*n/2 && i-j>=-n/2)
                    System.out.print((char)('A'+n-i) +" ");
                else   
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
