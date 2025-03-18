package NumberLogic;

public class P84_10HappyNum {
    static int happynumber(int n){
        int rem=0,sum=0;
        while(n>0){
            rem=n%10;
            n=n/10;
            sum+=rem*rem;
        }
        return (sum>9)? happynumber(sum):sum;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println("First Ten Happy numbers are:");
        int i=0;
        while(n>0) {
            int res =happynumber(i);
            if(res == 1) {
                System.out.println(i+" ");
                n--;
            }
            i++;
        }
    }
}
