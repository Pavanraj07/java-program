package NumberLogic;

public class PrimeFactors {
    static void factor(int n){
        int i;
        System.out.println("Prime factors are:  ");
        // while(n%2==0){
        //     System.out.print(2+" ");
        //     n=n/2;
        // }
        for(i=2;i*i<=n;i+=2){
            while(n%i==0){
                System.out.print(i+" ");
                n=n/i;
            }
        }
        if(n>2)
            System.out.print(n);

        System.out.println();    
    }
    public static void main(String[] args) {
        int n=88;
        factor(n);
    }
}
