package NumberLogic2;

public class P113_DecimaltoBinary {
    public static void main(String[] args) {
        int n=13;
        int res=0,power=1;
        while(n>0){
            int digit=n%2;
            res+=(digit*power);
            n/=2;
            power*=10;
        }
        System.out.println(res);
    }
}
