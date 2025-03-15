package Methods;

public class Sumoffactorial {
    static int result(int x){
        int rem=0,sum=0;
        while(x>0){
            rem=x%10;
            int product=1;
            x=x/10;
            for(int i=1;i<=rem;i++){
                product *= i;
            }
            sum+=product;
        }
        return sum;
}
    public static void main(String[] args) {
        int n=125369;
        System.out.println(result(n));
    }
}
