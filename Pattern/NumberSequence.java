package Pattern;

public class NumberSequence {
    static void Sequence(int n){
        for(int i=0;i<n;i++)
            System.out.print(i+" ");
        for(int i=n;i>=0;i--)
            System.out.print(i+" ");
    }
    public static void main(String[] args) {
        int n=10;
        n/=2;
        Sequence(n);//0 1 2 3 4 5 4 3 2 1 0 
    }
}
