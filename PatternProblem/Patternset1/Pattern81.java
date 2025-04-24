package PatternProblem.Patternset1;

public class Pattern81 {
    public static void main(String[] args) {
        int n=9;
        for(int i=0;i<n;i++){
            for(int k=0;k<5;k++){
                for(int j=0;j<n;j++){
                    if(i+j==n/2 || i-j==-n/2)
                        System.out.print(n*k+j+1);
                    else   
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
