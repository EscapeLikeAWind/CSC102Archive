// QuizCSC102#1.1(to Arrays) Problem 2

// You have a bar of chocolate, which consist of many chocolate pieces

/* 
You want to share pieces of chocolate to your friends by splitting the bar piece by piece from left to right and top to bottom.
Write the program to simulate chocolate bar splitting of the bar size (r × c) and number of your friends (n). 
Assume that the number of cholate pieces can be shared among your friends equally without any remainder.
The input consists of 3 values: size of chocolate bar in row and column and the number of friends.
The output is the chart of chocolate bar that indicates number the allocation of chocolate pieces as number (from 1 to n). 
If the number is two digits, the chart will display only the last digit (i.e., if the number is 10, the chart will show 0). 
*/

// Input (Made up) 5 7 5
// Output          1111122
//                 2223333
//                 3444445
//                 5555666
//                 6677777

import java.util.Scanner;

public class ChocolatePartition {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        // input chocolate dimension rxc (no array)
        int r = sc.nextInt();
        int c = sc.nextInt();
        // input n friend 
        int n = sc.nextInt();
        // part of 1 unit chocolate per n friend
        int pt = (r*c)/n;
        // making long string of chocolate
        String cocoa = new String("");
        sc.close();
        
        // construct long chocolate partition
        for (int i=1; i<=pt; i++){
            String frndgrp = new String("");
            // determine on last digit of chocolate
            String dg = new String("");
            if(i>=10){
                dg += i % 10;
            }else{
                dg += i; 
            }
            //friend group chocolate allocation
            for (int j=0; j<n; j++){
                frndgrp += dg; 
            }
            cocoa += frndgrp;
        }
        
        // print r substring of long chocolate 
        int op = 0;
        int ed = c;
        for (int i=0; i<r; i++){
            System.out.println(cocoa.substring(op, ed));
            op += c;
            ed += c;
        }
    }
}
