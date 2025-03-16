package NumberLogic;

public class CalculateGCD {
    static int GCD(int x,int y){
        int res=0;
        while(x>0){
            res=x%y;
            x=y;
            y=res;
            if(res==0)
                break;
        }
        return x;
    }
    public static void main(String[] args) {
        int x=184 , y=84;
        System.out.println("GCD is:"+GCD(x,y));
    }
}
