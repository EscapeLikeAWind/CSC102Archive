//QuizCSC102#1.1 Problem 1 

//Reverse the given string.

//Input   registration
//Output  noitartsiger

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        // data attributes
        String initial = sc.nextLine();
        int i = initial.length() - 1;
        sc.close();
        
        // print last char of string to first one [counting from length-1 to 0]
        while (i>=0){
            System.out.print(initial.charAt(i));
            i--;
        }
    }
}
