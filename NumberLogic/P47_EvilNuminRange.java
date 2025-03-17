package NumberLogic;

public class P47_EvilNuminRange {
    static boolean evil(int n){
        int count=0;
        while(n>0){
            n=n&(n-1);
            count++;
        }
        return count%2==0;
    }
    public static void main(String[] args) {
        int n=100;
        System.out.println("Evil numbers are:");
        for(int i=1;i<=n;i++){
            if(evil(i))System.out.print(i+" ");
        }
    }
}
