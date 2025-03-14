package Methods;

public class MethodOverloading {
    static int max(int x,int y){
        return (x>y)?x:y;
    }
    static int max(int x,int y,int z){
        return (x>y&&x>z)?x:(y>z)?y:z ;
    }
    public static void main(String[] args) {
        int a=10,b=20,c=30;
        System.out.println(max(a,b));
        System.out.println(max(a,b,c));
    }
}
