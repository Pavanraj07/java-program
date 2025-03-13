public class Merge2num {
    public static void main(String[] args) {
        int x=1234;
        int y=77;
        int a=y;
        int count=0;
        while(y>0){
            count++;
            y=y/10;
        }
        for(int i=0;i<count;i++){
            x=x/10;
        }
        for(int i=0;i<count;i++){
            x=x*10;
        }
        x=x+a;
        System.out.println(x);
    }
}
