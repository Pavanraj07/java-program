package String;

public class P7_AdjacentSwap {
    static void Display(char[] ch) {
        for(int i=0; i<ch.length; i++)
            System.out.print(ch[i]);
        System.out.println();
    }
    static void SwapAdjacent(char ch[], int start, int end) {
        // System.out.println(start+" "+end+" "+i);
        // int count = (end - start) + 1;
        for(int j=start; j<=end; j += 2) {
            if(j+1 == end-1) continue;
            char temp = ch[j];
            ch[j] = ch[j+1];
            ch[j+1] = temp;
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
                SwapAdjacent(ch, start, end);
                start = i + 1;
            }
        }

        System.out.println(StringPut(ch));
    }
}
