package String;

public class P3_CountWord {
    static void print(char[] ch){
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }
        System.out.println();
    }
    // static void Reverse(char[] ch,int start,int end){
    //     int i=start, j=end;
    //     while(i<j){
    //         char temp=ch[i];
    //         ch[i]=ch[j];
    //         ch[j]=temp;
    //         i++;
    //         j--;
    //     }
    // }
    static void AddCount(char[] ch ,int start ,int end){
        int count=(end-start)+1;
        ch[end]=(char)(count+48);
    }
    public static void main(String[] args) {
        String s="what is your name";
        char ch[]=s.toCharArray();
        System.out.print("String is: ");
        print(ch);
        System.out.print("Reversed String is: ");
        int start = 0;
        for(int i=0; i<ch.length; i++) {
            if(ch[i] == ' ' || i == ch.length - 1) {
                int end = (i==ch.length-1)?i:i-1;
                AddCount(ch, start, end);
                start = i+1;
            }
        }
        print(ch);
    }
}
