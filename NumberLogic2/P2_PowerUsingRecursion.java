package NumberLogic2;

public class P2_PowerUsingRecursion {
    static int result(int x,int y){
        int temp=x;
        while(y>1){
            x=temp*x;
            y--;
        }
        return x;
    }

}
