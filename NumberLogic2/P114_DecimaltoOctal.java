package NumberLogic2;

public class P114_DecimaltoOctal {
    public static void main(String[] args) {
        int n=132;
        int res=0,power=1;
        while(n>0){
            int digit=n%8;
            res+=(digit*power);
            n/=8;
            power*=10;
        }
        System.out.println(res);
    }
}
