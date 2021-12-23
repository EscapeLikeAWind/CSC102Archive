//ASCII art height white space is illusive!

import java.util.Scanner;

public class PatternCube {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int side  = sc.nextInt();
        String sMoneDash = new String(new char[side-1]).replace("\0", " ");
        String sideDot = new String(new char[side]).replace("\0", "*");
        String dotDashDot = "*" + new String(new char[side-2]).replace("\0", " ") + "*";
        String midLongDD = new String(new char[side-2]).replace("\0", " ") + "*";
        sc.close();

        System.out.print(sMoneDash + sideDot + "\n");
        for(int i=1; i<=side-2; i++){
            System.out.print(sMoneDash.substring(0, sMoneDash.length()-i) + dotDashDot + midLongDD.substring(midLongDD.length()-i, midLongDD.length()) + "\n");
        }
        System.out.print(sideDot + midLongDD + "\n");
        for(int i=side-2; i>=1; i--){
            System.out.print(dotDashDot + midLongDD.substring(midLongDD.length()-i, midLongDD.length()) + "\n");
        }
        System.out.print(sideDot);
        
    }
}