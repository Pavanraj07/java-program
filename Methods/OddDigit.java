package Methods;

public class OddDigit {
    static int result(int x){
        int count=0,rem=0,rev=0,p=1;
        while(x>0){
            rem=x%10;
            x=x/10;
            if(rem%2!=0){
                count++;
                rev=rem*p+rev;
                p=p*10;
        }
    }
        System.out.println(count);
        return rev;
    }
    public static void main(String[] args) {
        int n=1253946;
        System.out.println("Odd numbers are:"+result(n));
    } 
}
