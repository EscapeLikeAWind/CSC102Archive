// Input 4541656
// Output 8 233

//       78963321
//       150 85

//       1920
//       0 1

import java.util.Scanner;

public class YearConverter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        sc.close();

        int yrs = min/(60*24*365);
        int remmin = min - (yrs*525600);
        int days = remmin/(60*24);
        System.out.println(yrs + " " + days);
    }
}