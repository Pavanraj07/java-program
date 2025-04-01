package PatternProblem.Patternset1;

public class Pattern34 {
    public static void main(String[] args) {
        int n=5 ;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<=n;j++){
                if(i-j<0)
                    System.out.print(n-i-count++ +" ");
                else   
                    System.out.print( " ");
            }
            System.out.println();
        }
    }
}
