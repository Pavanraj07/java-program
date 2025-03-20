package NumberLogic2;

public class P116_BinarytoOctal {
    static int BinarytoDecimal(int n){
        int res=0,power=1;
        while(n>0){
            int digit=n%10;
            res+=(digit*power);
            n/=10;
            power*=2;
        }
        return res;
    }
    public static void main(String[] args) {
        int n=11101011;
        int sum=BinarytoDecimal(n);
        int res=0,power=1;
        while(sum>0){
            int digit=sum%8;
            res+=(digit*power);
            sum/=8;
            power*=10;
        }
        System.out.println(res);
    }
}
