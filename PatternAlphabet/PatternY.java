package PatternAlphabet;
public class PatternY {
    public static void main(String[] args) {
        int n = 15;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i - j == 0 && i < n / 2) || i + j == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

