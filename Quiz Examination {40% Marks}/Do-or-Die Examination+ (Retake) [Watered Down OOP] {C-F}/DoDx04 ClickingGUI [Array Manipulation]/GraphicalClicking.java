import java.util.Scanner;

public class GraphicalClicking {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int clicks = sc.nextInt();
        int[][] arr = new int[row][col];

        for(int i=0; i<clicks; i++){
            int positRow = sc.nextInt();
            int positCol = sc.nextInt();

            if(positRow-1 >= 0){
                arr[positRow-1][positCol]++;
            }
            if(positRow+1 <= row-1){
                arr[positRow+1][positCol]++;
            }
            if(positCol-1 >= 0){
                arr[positRow][positCol-1]++;
            }
            if(positCol+1 <= col-1){
                arr[positRow][positCol+1]++;
            }
            arr[positRow][positCol]++;
        }
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
        
        sc.close();
    }
}
