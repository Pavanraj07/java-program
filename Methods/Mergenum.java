package Methods;

public class Mergenum {
    static int merge(int a,int b){
        int count=0;
        int z=b;
        while(b>0){
            count++;
            b=b/10;
        }
        for(int i=0;i<count;i++){
            a=a/10;
        }
        for(int i=0;i<count;i++){
            a=a*10;
        }
        a=a+z;
        return a;
    }
    public static void main(String[] args) {
        int x=1234;
        int y=77;
        System.out.println(merge(x,y));
        
        
    }
}
