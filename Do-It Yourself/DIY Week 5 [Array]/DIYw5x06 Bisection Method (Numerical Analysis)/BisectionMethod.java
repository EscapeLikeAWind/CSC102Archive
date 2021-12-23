//Input 2 3 8 -4.5 0.001
//Output 2.4306640625

import java.util.Scanner;

public class BisectionMethod {

    public static double f(double c1, double c2, double x) {
        return c1 + c2 * (x - Math.sin(x));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c1 = sc.nextDouble();
        double c2 = sc.nextDouble();
        double targetTolerance = sc.nextDouble();
        sc.close();

        double tolerance = (b - a)/2; // Calculate initial tolerance
        double Xns = (a + b) / 2; // Calculate initial Xns

        if (f(c1, c2, a) * f(c1, c2, b) < 0) {
            // While the tolerance (error) is still more than targeted tolerance
            while (tolerance > targetTolerance) {
                if (f(c1, c2, a) * f(c1, c2, Xns) < 0) {
                    // Algorithm number 4
                    // a = a;
                    b = Xns; // Assign new b to be Xns
                } else {
                    // Algorithm number 5
                    a = Xns;  // Assign new a to be Xns
                    // b = b;
                }
                tolerance = (b-a)/2; // Calculate new tolerance
                Xns = (a+b) / 2; // Calculate new Xns
            }
        }
        System.out.println(Xns);
    }
}

// The code is solely implemented by thetkpark(GitHub), CS@SIT KMUTT Senior