package NumberLogic;

public class P26_DisariumNum {
    static void disarium(int n){
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
        System.out.println(val==sum ? "It is a Disarium Number" : "It is Not a Disarium Number");
    }
    public static void main(String[] args) {
        int n=135;
        disarium(n);
    }
}
