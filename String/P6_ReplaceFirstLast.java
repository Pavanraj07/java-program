package String;

public class P6_ReplaceFirstLast {
    static void Display(char[] ch) {
        for(int i=0; i<ch.length; i++)
            System.out.print(ch[i]);
        System.out.println();
    }
    static void ReplaceFirstnLast(char ch[], int start, int end) {
        char temp = ch[start];
        ch[start] = ch[end];
        ch[end] = temp;
    }
    static String StringPut(char ch[]) {
        String s = "";
        for(int i=0; i<ch.length; i++) 
            s += ch[i];
        
        return s;
    }
    public static void main(String[] args) {
        String str = "What is your name";
        char ch[] = str.toCharArray();
        Display(ch);
        int start = 0;
        for(int i=0; i<ch.length; i++) {
            if(ch[i] == ' ' || i == ch.length - 1) {
                int end = (i == ch.length - 1) ? i : i - 1;
                ReplaceFirstnLast(ch, start, end);
                start = i + 1;
            }
        }

        System.out.println(StringPut(ch));
    }
    
}
