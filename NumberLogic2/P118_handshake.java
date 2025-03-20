package NumberLogic2;

public class P118_handshake {
    static int add(int n){
        if(n==1)
            return 0;
        else
            return ((n*(n-1))/2);
    }
    public static void main(String[] args) {
        int n=17;
        int res=add(n);
        System.out.println(res);
    }
    
}
