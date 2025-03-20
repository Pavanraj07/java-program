package NumberLogic2;

public class P115_OctaltoDecimal {
    public static void main(String[] args) {
        int n=512;
        int res=0,power=1;
        while(n>0){
            int digit=n%10;
            res+=(digit*power);
            n/=10;
            power*=8;
        }
        System.out.println(res);
    }
}
