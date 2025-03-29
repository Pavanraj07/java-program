package Pattern;

public class NumberSequence {
    static int i;
    static void Sequence(int n){
        if(n<4){
            System.out.print(n+" ");
            Sequence(n+1);
        }
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Sequence(i);
    }
}
