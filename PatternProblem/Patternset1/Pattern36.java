package PatternProblem.Patternset1;

public class Pattern36 {
    public static void main(String[] args) {
        int n=5 ;
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=0;j<=n;j++){
                if(i-j<0)
                    System.out.print((char)('A'+n-i-count++) +" ");
                else   
                    System.out.print( " ");
            }
            System.out.println();
        }
    }
}
