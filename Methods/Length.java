package Methods;

public class Length {
    static int result(int x){
        int count=0;
        while(x>0){
            x=x/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n=125369;
        System.out.println(result(n));
    }
}
