package NumberLogic;

public class P18_AbundantNum {
    static void Abundantnumber(int n){
        int sum=0;
        int temp=n;
        for(int i=1;i<n;i++){
            if(n%i==0)
                sum+=i;
        }
        if(sum>temp)
            System.out.println("Abundant Number");
        else
            System.out.println("Not Abundant Number");
    }
    public static void main(String[] args) {
        int n=18;
        Abundantnumber(n);
    }
}
