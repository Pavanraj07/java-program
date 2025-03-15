package Methods;

public class MinNum {
    static int MinDigit(int x){
        int rem=0,min=999;
        while(x>0){
            rem=x%10;
            x=x/10;
            if(rem<min)
                min=rem;
        }
        return min;
    }
    public static void main(String[] args) {
        int n=125369;
        System.out.println(MinDigit(n));
    } 
}
