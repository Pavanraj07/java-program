package Methods;

public class Power {
    static int result(int x,int y){
        int temp=x;
        while(y>1){
            x=temp*x;
            y--;
        }
        return x;
    }
    public static void main(String[] args) {
        int a=2,b=3;
        System.out.println(result(a,b));
    }
}
