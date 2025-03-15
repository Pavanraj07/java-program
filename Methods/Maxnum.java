package Methods;

public class Maxnum {
    static int MaxDigit(int x){
        int rem=0,max=0;
        while(x>0){
            rem=x%10;
            x=x/10;
            if(rem>max)
                max=rem;
        }
        return max;
    }
    public static void main(String[] args) {
        int n=125369;
        System.out.println(MaxDigit(n));
    }
}
