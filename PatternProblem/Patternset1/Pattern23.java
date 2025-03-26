package PatternProblem.Patternset1;

public class Pattern23 {
    public static void main(String[] args) {
        int n=8 ,res=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i-j<0 && j>=n/2 && i+j>=n-1 && j>=n/2){
                    res=(n/2)-j+i;
                    System.out.print(res<0?-res +" ": res+" ");
                }
                else   
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
