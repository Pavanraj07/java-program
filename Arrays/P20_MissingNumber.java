package Arrays;

public class P20_MissingNumber {
    static int missing(int[]a){
        int n=a.length,sum=0;
        int total=(n*(n+1))/2;
        for(int i:a){
            sum+=i;
        }
        return total-sum;
    }
    public static void main(String[] args) {
        int[] a={3,0,1,5,2};
        System.out.println(missing(a));
    }
}
