//Input 2.23564 4
//Output 2.2356

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class FloatedRounding {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double flot = sc.nextDouble();
        BigDecimal bigFlot = new BigDecimal(Double.toString(flot));
        int fracPartPoint = sc.nextInt();
        sc.close();

        bigFlot = bigFlot.setScale(fracPartPoint, RoundingMode.HALF_UP);
        System.out.print(bigFlot.doubleValue());
    }
}
