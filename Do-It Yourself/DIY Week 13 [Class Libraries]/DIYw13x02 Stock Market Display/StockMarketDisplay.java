// Input 4
//       AOT 0.50 0.78 488335.20
//       BDMS 0.30 1.27 267396.01
//       BEM -0.10 -1.11 10322.25
//       DELTA +16.00 +3.90 834742.88
//  Output AOT       +0.50     +0.78     488,335.20
//         BDMS      +0.30     +1.27     267,396.01
//         BEM       -0.10     -1.11      10,322.25
//         DELTA    +16.00     +3.90     834,742.88

import java.util.Scanner;

public class StockMarketDisplay{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int stocks = Integer.parseInt(sc.nextLine());
        for(int i=0; i<stocks; i++){
            String name = sc.next();
            String changeUnit = sc.next();
            String changePercent = sc.next();
            String value = sc.next();
            System.out.printf("%-5s", name);
            System.out.printf("%+10.2f", Double.parseDouble(changeUnit));
            System.out.printf("%+10.2f", Double.parseDouble(changePercent));
            System.out.printf("%,15.2f%n", Double.parseDouble(value));
        }
        sc.close();

    }
}