package PatternProblem.Patternset1;

public class Pattern10 {
    public static void main(String[] args) {
        int n=10 ;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i-j>0 && j<=n/2 && i+j<=n-1 && j<=n/2)
                    System.out.print(j+1+" ");
                else   
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
