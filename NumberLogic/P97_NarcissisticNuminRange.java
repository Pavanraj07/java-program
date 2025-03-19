package NumberLogic;

public class P97_NarcissisticNuminRange {
    static int Narcissistic(int n){
        int count=0, sum=0, val=n;
        while(val>0) {
            val /= 10;
            count++;
        }
        val = n;
        while(n > 0) {
            int rem = n % 10;
            int temp = rem;
            for(int i=1; i<count; i++) 
                temp = temp * rem;
            sum += temp;
            n /= 10;
        }
        return (val==sum) ? val : 0;
    }
    public static void main(String[] args) {
        int n=1000;
        System.out.println("Narcissistic decimal numbers are:");
        for(int i=0;i<=n;i++){
            int res=Narcissistic(i);
            if(res!=0)System.out.println(res+" ");
        }
    }
}
