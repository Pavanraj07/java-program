package PatternProblem.Patternset1;

public class Pattern77 {
    public static void main(String[] args) {
        int n=5 ;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if( i==n/2 || j==n/2 )
                    System.out.print("X ");
                else   
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
