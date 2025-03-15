package NumberLogic;

public class PrimeNum {
    static int prime(int x){
        int flag=0;
        for(int i=2;i<x/2 ; i++){
            if(x%i==0){
                flag=1;
                break;
            }
        }
        return (flag==1)?1:0;
    }
    public static void main(String[] args) {
        int n=10;
        if(prime(n)==1)
            System.out.println("Not prime");
        else
            System.out.println("Prime");
    }
}
