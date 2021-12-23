// QuizCSC102#1.1(to Arrays) Problem 4

// Write a program to search given words in the given array. 
// Noted that the word can be read in 8 directions which are 
// Left to Right, Right to Left, Top to Bottom, Bottom to Top, TopLeft to BottomRight, BottomRight to TopLeft, BottomLeft to TopRight, and TopRight to BottomLeft. 
// Noted that the search is case sensitive.

// The input consists of 4 parts. The first part is the number n and m representing rows and columns of array. The second part is the next n lines representing array of characters. The third part is number of search words. The last part is the list of search words. 

// The output is list of words followed by the word "found" or "not found".

// Input 12 12
//       W S K M Z R V L P G P B  
//       P Y T H O N F O R M W S  
//       B M Y N Y O Z Q O H C V  
//       P R X G R A M X G Q L L  
//       Q P Q Z K F P X R T F E  
//       H I Y S Q U Y E A P Q U  
//       Q E G V X W Z D M Q V Y  
//       C T D N N G T H M L T R  
//       H F E L I U V F J C T U  
//       R V B J F D L P M R U T  
//       Q Q G W Y Q O K E Y B P  
//       G R L P U Y D C K V S C
//       5
//       PYTHON ALGORITHM CODING PROGRAM DATA

// Output PYTHON found
//        ALGORITHM not found
//        CODING found
//        PROGRAM found
//        DATA not found

import java.util.Scanner;

public class WordSearch {

    static int row, col;
        public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        col = sc.nextInt();
        char[][] grid = new char[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                grid[i][j] = sc.next().charAt(0);
            }
        }
        int check = sc.nextInt();
        String[] wArrr = new String[check];
        for(int i=0; i<check; i++){
            wArrr[i] = sc.next();
        }
        sc.close();
    }
}
