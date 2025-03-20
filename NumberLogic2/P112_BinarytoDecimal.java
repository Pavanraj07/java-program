package NumberLogic2;

public class P112_BinarytoDecimal {
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
