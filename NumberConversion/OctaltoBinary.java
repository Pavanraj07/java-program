package NumberConversion;

public class OctaltoBinary {
    static int OctaltoDecimal(int n){
        int power=1,res=0;
        while(n>0){
            int rem=n%10;
            n/=10;
            res+=(rem*power);
            power*=8;
        }
        return res;
    }
    public static void main(String[] args) {
        int n=353;
        int sum=OctaltoDecimal(n);
        int rem=0,res=0,power=1;
        while(sum>0){
            rem=sum%2;
            sum/=2;
            res+=(rem*power);
            power*=10;
        }
        System.out.println(res);
    }
}
