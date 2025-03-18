package NumberLogic;

import java.util.Random;

public class P78_RandomIntegerinRange {
     public static void main(String[] args) {
        Random rand = new Random();
        
        int RandomNum = rand.nextInt(100);
        System.out.println("Random Number is: " + RandomNum);
    }
}
