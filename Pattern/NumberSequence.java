package Pattern;

public class NumberSequence {
    static void Sequence(int n){
        for(int i=0;i<n;i++)
            if(i<n/2)
                System.out.print(i+" ");
            else
                System.out.print(n-i-1+" ");
        // for(int i=n;i>=0;i--)
        //     System.out.print(i+" ");
    }
    public static void main(String[] args) {
        int n=11;
        Sequence(n);//0 1 2 3 4 5 4 3 2 1 0 
    }
}
