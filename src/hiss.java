import java.util.Scanner;

public class hiss {
    public static void main(String[] args) {
        Scanner tgb = new Scanner(System.in);
        String N = tgb.nextLine();

        if (N.contains("ss")) {
            System.out.println("hiss");
        }else {
            System.out.println("no hiss");
        }
    }
}
