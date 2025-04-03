package String;

public class P1_ReverseString {
    static void print(char[] ch){
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }
        System.out.println();
    }
    static void Reverse(char[] ch){
        int i=0 , j=ch.length-1;
        while(i<j){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        String s="what is your name";
        char ch[]=s.toCharArray();
        System.out.print("String is: ");
        print(ch);
        Reverse(ch);
        System.out.print("Reversed String is: ");
        print(ch);

    }
}
