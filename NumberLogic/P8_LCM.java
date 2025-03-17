package NumberLogic;

public class P8_LCM {
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
    static int CalculateLCM(int x,int y){
        int res= x*y;
        return res/GCD(x,y);
    }
    public static void main(String[] args) {
        int x=4 , y=8;
        System.out.println("LCM is:"+CalculateLCM(x,y));
    }
}
