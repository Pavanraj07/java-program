package NumberLogic;

public class P21_Friendlypair {
    static void pair(int m,int n){
        int sum1=0,div1=0;
        int sum2=0,div2=0;
        for(int i=1;i<=m;i++){
            if(m%i==0)
                sum1+=i;
            div1=sum1/m;
        }

        for(int i=1;i<=n;i++){
            if(n%i==0)
                sum2+=i;
            div2=sum2/n;
        }
        if(div1==div2)
            System.out.println("Friendly pair");
        else    
            System.out.println("Not Friendly pair");
        
    }
    public static void main(String[] args) {
        int m=6 , n=28;
        pair(m,n);
    }
}
