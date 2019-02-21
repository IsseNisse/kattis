import java.util.Scanner;

public class stuckInATimeLoop {
    public static void main(String[] args) {
        Scanner tgb = new Scanner(System.in);
        int N = tgb.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println(i + " Abracadabra");
        }
    }
}
