package Methods;

public class EvenDataEncoding {
    static void result(int x){
        int rem=0,rev=0;
        while(x>0){
            rem=x%10;
            x=x/10;
            rev=rev*10+rem;
        }
        int rem1=0;
        System.out.println("Encoded value is:");
        while(rev>0){
            rem1=rev%10;
            rev=rev/10;
            System.out.print((rem1%2==0)? 0 : 1);
        }
}
    public static void main(String[] args) { 
        int n=125369;
        System.out.println("Number is :"+n);
        result(n);
    }
}
