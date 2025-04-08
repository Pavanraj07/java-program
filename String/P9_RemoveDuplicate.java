package String;

public class P9_RemoveDuplicate {
    static String removedup(char a[]){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j] )
                    a[j]='&';
            }
        }
        String s="";
        for(int i=0;i<n;i++){
            if(a[i]!='&')
                s+=a[i];
        }
        return s;
    }
    public static void main(String[] args) {
        String s="what is yooooour name";
        char a[]=s.toCharArray();
        System.out.println(s);
        System.out.println(removedup(a));
    }
}
