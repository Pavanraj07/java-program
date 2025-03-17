package NumberLogic;

public class P21_Friendlypair {
    static void pair(int m,int n){
        int sum1=0;
        int sum2=0;
        for(int i=1;i<=m;i++){
            if(m%i==0)
                sum1+=i;
        }
        System.out.println(sum1);

        for(int i=1;i<=n;i++){
            if(n%i==0)
                sum2+=i;
        }
        System.out.println(sum2);
    }
    public static void main(String[] args) {
        int m=6 , n=28;
        pair(m,n);
    }
}
