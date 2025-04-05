package String;

public class P8_UpeercaseVowel {
    static void Display(char[] ch) {
        for(int i=0; i<ch.length; i++)
            System.out.print(ch[i]);
        System.out.println();
    }
    static void UpperCaseVowel(char ch[], int start, int end) {
        for(int j=start; j<=end; j ++) {
            if(ch[j] == 'a' || ch[j] == 'e' || ch[j] == 'i' || ch[j] == 'o' || ch[j] == 'u') {
                ch[j] = (char)(ch[j] - 32);
            }
        }   
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
                UpperCaseVowel(ch, start, end);
                start = i + 1;
            }
        }

        System.out.println(StringPut(ch));
    }
}
