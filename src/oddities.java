import java.util.Scanner;

public class oddities {
    public static void main(String[] args) {
        Scanner tgb = new Scanner(System.in);
        int N = tgb.nextInt();

        for (int i = 0; i < N; i++) {
            int x = tgb.nextInt();

            if (x % 2 == 0) {
                System.out.println(x + " is even");
            } else {
                System.out.println(x + " is odd");
            }
        }
    }
}
