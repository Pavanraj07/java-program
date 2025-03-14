package Basics;
public class Merge {
    public static void main(String[] args) {
        int x=1234;
        int y=77;
        int a=y;
        while(y>0){
            x=x*10;
            y=y/10;
        }
        x=x+a;
        System.out.println(x);
    }
    
}
