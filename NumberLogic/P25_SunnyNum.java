package NumberLogic;

public class P25_SunnyNum {
    static void sunnynumber(int n){
        int flag = 0;
        for(int i=2; i<=n/2; i++) {
            if(i*i == n) {
                flag = 1;
                break;
            }
        }  
        System.out.println((flag == 1) ? "It is a Sunny Number" : "It is Not a Sunny Number");
    }
    public static void main(String[] args) {
        int n=8;
        sunnynumber(n+1);
}
}
