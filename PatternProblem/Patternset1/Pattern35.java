package PatternProblem.Patternset1;

public class Pattern35 {
    public static void main(String[] args) {
        int n = 5;
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=n;j++) {
                if (i-j <=0) 
                    System.out.print((char)('A'+n-i)+" "); 
                else
                    System.out.print(" "); 
            }
            System.out.println();
        }
    }
}
