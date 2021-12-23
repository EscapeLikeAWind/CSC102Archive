//QuizCSC102#1.2 (to Arrays) Problem 2

/* 
Mr. Tutorism wants to create a program to help him determines the ripeness of papaya. 
The ripeness of papaya is divided into 3 stages of 0, 1, and 2 representing unripe, medium, and ripe respectively. 
Write a program to count number of papaya in each stage.
*/

// Noted:
// 1. If there is no papaya, the program must output the text "There is no papaya!"
// 2. If any stage of ripening is not there, do not output that stage.
// 3. If there is more than 1 papaya, change the sentence properly by using "There is" and provide the "s" after papaya as they are plural.

// The input consists of 2 parts. The first part is an interger representing number of papaya. The second part is the list of papaya stages of each papaya. 
// The second part may not exist if the first part indicates that there is no papaya (i.e., 0).
// The output is the text showing number of papayas in each stage.

// Input  6                              1                          0
//        1 2 0 0 1 0                    0

// Output There are 3 unripe papayas     There is 1 unripe papaya   There is no papaya!
//        There are 2 medium papayas
//        There is 1 ripe papaya


import java.util.Scanner;

public class PapayaClassification{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        // data attributes
        int ppynum = sc.nextInt();
        int unripe = 0;
        int medium = 0;
        int ripe = 0;
        String there = "There ";
        String are = "are ";
        String is = "is ";
        String ur = " unripe papaya";
        String med = " medium papaya";
        String rp = " ripe papaya";
        
        // papaya type classification and counting
        for (int i=0; i<ppynum; i++){
            int stat = sc.nextInt();
            if (stat == 0){
                unripe += 1;
            }
            if (stat == 1){
                medium += 1;
            }
            if (stat == 2){
                ripe += 1;
            }
        }

        // output sentence construction
        if (ppynum == 0){
            System.out.println("There is no papaya!");
        }
        if (unripe > 1) {
            System.out.println(there + are + unripe + ur + "s");
        }
        if (medium > 1) {
            System.out.println(there + are + medium + med + "s");
        }
        if (ripe > 1) {
            System.out.println(there + are + ripe + rp + "s");
        }
        if (unripe == 1) {
            System.out.println(there + is + "1" + ur);
        }
        if (medium == 1) {
            System.out.println(there + is + "1" + med);
        }
        if (ripe == 1) {
            System.out.println(there + is + "1" + rp);
        }
        
        // waiting for next test input and resource leak
        PapayaClassification.main(args);
        sc.close();
    }
}