package Methods;

public class SinglrDigitSum {
    static int add(int x){
        int rem=0 ,sum=0    ;
        while(x>0){
            rem=x%10;
            x=x/10;
            sum=sum+rem;
        }
        return sum>9?add(sum):sum;
    }
    public static void main(String[] args) {
        int n=125369;
        System.out.println(add(n));
    }
}
