package PatternProblem.Patternset1;

public class Pattern27 {
    public static void main(String[] args) {
        int n=9 ;
        for(int i=0;i<n;i+=2){
            for(int j=0;j<n;j++){
                if(i+j>=n-1)
                    System.out.print("* ");
                else   
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
