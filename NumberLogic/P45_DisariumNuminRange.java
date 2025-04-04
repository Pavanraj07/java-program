package NumberLogic;

public class P45_DisariumNuminRange {
    static int disarium(int n){
        int j=0, sum = 0, val = n;
        while( val > 0 ) {
            val /= 10;
            j++;
        }
        val = n;
        while(n > 0) {
            int rem = n % 10;
            int temp = rem;
            for(int i=j; i>1; i--) 
                rem = rem * temp;
            sum += rem;
            j--;
            n /= 10;
        }
        return (val==sum) ? val : 0;
    }
    public static void main(String[] args) {
        int n=135;
        System.out.println("Disarium numbers are:");
        for(int i=0;i<=n;i++){
            int res=disarium(i);
            if(res!=0)System.out.println(res+" ");
        }
    }
}
