package PatternProblem.Patternset1;

public class Pattern56 {
    public static void main(String[] args) {
        int n=8 ;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(i+j==n/2 || i-j==n/2 || i+j==3*n/2 || i-j==-n/2){
                    System.out.print(n/2-i+1+" ");
                }
                else   
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
