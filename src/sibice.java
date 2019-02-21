import java.util.Scanner;

import static java.lang.Math.sqrt;

public class sibice {
    public static void main(String[] args) {
        Scanner tgb = new Scanner(System.in);
        double N = tgb.nextDouble();
        double h = tgb.nextDouble();
        double w = tgb.nextDouble();

        double c = getMaxSize(h,w);

        for (int i = 0; i < N; i++) {
            double size = tgb.nextDouble();
            if (size <= c) {
                System.out.println("DA");
            }else{
                System.out.println("NE");
            }
        }
    }

    public static double getMaxSize (double h, double w) {
        return sqrt((h*h) + (w*w));
    }
}
