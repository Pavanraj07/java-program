package String;

public class P10_ASCIIValueofChar {
    public static void main(String[] args) {
        String s="what is your name";
        char a[]=s.toCharArray();
        int n=a.length;
        String num="";
        for(int i=0;i<n;i++)
            num=num+(int)a[i]+" ";
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        System.out.println("\n"+num);
           
    }
}
