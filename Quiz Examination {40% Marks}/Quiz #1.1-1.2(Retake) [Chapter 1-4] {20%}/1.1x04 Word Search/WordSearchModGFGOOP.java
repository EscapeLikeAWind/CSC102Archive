import java.util.Scanner;

public class WordSearchModGFGOOP {
    
    // Rows and columns in the given grid
    static int R, C;
    
    // For searching in all 8 direction *Anti-clockwise Quadrant order*
    static int[] x = { 1, 1, 0, -1, -1, -1, 0, 1 };
    static int[] y = { 0, 1, 1, 1, 0, -1, -1, -1 };
    
    // This function searches in all
    // 8-direction from point
    // (row, col) in grid[][]
    static boolean search2D(char[][] grid, int row, int col, String word) {
        // If first character of word
        // doesn't match with
        // given starting point in grid.
        if (grid[row][col] != word.charAt(0))
        return false;
        
        // Search word in all 8 directions
        // starting from (row, col)
        for (int dir = 0; dir < 8; dir++) {
            // Initialize starting point
            // for current direction
            int k, 
            rd = row + x[dir], cd = col + y[dir];
            
            // First character is already checked,
            // match remaining characters
            for (k = 1; k < word.length(); k++) {
                // If out of bound break
                if (rd >= R || rd < 0 || cd >= C || cd < 0)
                break;
                
                // If not matched, break
                if (grid[rd][cd] != word.charAt(k))
                break;
                
                // Moving in particular direction
                rd += x[dir];
                cd += y[dir];
            }
            
            // If all character matched,
            // then value of must
            // be equal to length of word
            if (k == word.length())
            return true;
        }
        return false;
    }
    
    // Searches given word in a given
    // matrix in all 8 directions
    static void validSearch(char[][] grid, String word) {
    
        // Consider every point as starting
        // point and search given word on FIRST occasion, Depth first search(DFS) can be implemented for multiple instances trace.
        for (int row = 0; row < R; row++) {
            for (int col = 0; col < C; col++) {
                if (search2D(grid, row, col, word)) {
                    System.out.println(word + " found");
                    return;
                } else if (row == R-1 & col == C-1 & !search2D(grid, row, col, word)){
                    System.out.println(word + " not found");
                } else {}
            }
        }
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        char[][] grid = new char[R][C];
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                grid[i][j] = sc.next().charAt(0);
            }
        }
        int browse = sc.nextInt();
        
        for(int i=0; i<browse; i++){
            validSearch(grid, sc.next());
        }
        sc.close();
    }
}

// This code is solely implemented by rachana soma, at GeeksForGeeks