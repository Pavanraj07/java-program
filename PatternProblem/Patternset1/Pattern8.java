package PatternProblem.Patternset1;

public class Pattern8 {
    public static void main(String[] args) {
        int n=5 ,count=0;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(i-j>0 ){
                    count++;
                    System.out.print(count+" ");  
                }
                System.out.print(" ");
            }
            System.out.println();
        } 
    }
}
