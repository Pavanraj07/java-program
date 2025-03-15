package Methods;

public class Program8 {
    static int reverse(int x,int y){
        int temp1=x , temp2=y;
        int count1=0,count2=0;

        while(temp1>0){
            temp1=temp1/10;
            count1++;
        }

        while(temp2>0){
            temp2=temp2/10;
            count2++;
        }

        count1=count2-count1;

        int rem=0,rev=0;
        temp1=y;
        for(int i=0;i<count1;i++){
            rem = temp1%10;
            temp1=temp1/10;
            rev=rev*10+rem;
            x=x*10;
        }
        int reve=0;
        while(rev>0){
            rem=rev%10;
            rev=rev/10;
            reve=reve*10+rem;
        }
        return x+reve;
}
    public static void main(String[] args) {
        int a=77;
        int b=1234;
        System.out.println(reverse(a,b));
}
}
