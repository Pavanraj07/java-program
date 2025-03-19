package NumberLogic2;

import java.util.Scanner;

public class P105_VowelorConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch=sc.next().charAt(0);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            System.out.println(ch+" is Vowel");
        else        
            System.out.println(ch+" is Consonent");
    }
}
