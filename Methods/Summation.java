package Methods;

public class Summation {
    static int result(int x){
        int rem=0,sum=0;
        while(x>0){
            rem=x%10;
            x=x/10;
            for(int i=0;i<=rem;i++){
                sum=sum+i;
            }
        }
        return sum;
}
    public static void main(String[] args) {
        int n=125369;
        System.out.println(result(n));
    }
}
