package PatternProblem.Patternset1;

public class Pattern79 {
    public static void main(String[] args) {
        int n=11;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i <= n/4 && j<=n/4) || (i <= n/2 && i>n/4 && j<=n/2) || (i <= 3*n/4 && i>n/4 && i>n/2 && j<=3*n/4))
                    System.out.print("X ");
                else   
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
