package NumberLogic;

public class P29_EvilNum {
    static int evil(int n){
        int count=0;
        while(n>0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n=10;
        if(evil(n)%2==0)
            System.out.println("Evil number");
        else    
            System.out.println("Not a evil number");
    }
}
