package NumberConversion;

public class  BinarytoDecimal {
    // static int power(int x,int y){
    //     int temp=x;
    //     while(y>1){
    //         x=temp*x;
    //         y--;
    //     }
    //     return x;
    // }
    public static void main(String[] args) {
        int n=1001;
        int res=0,power=1;
        while(n>0){
            int digit=n%10;
            res+=(digit*power);
            n/=10;
            power*=2;
        }
        System.out.println(res);
    }
}
