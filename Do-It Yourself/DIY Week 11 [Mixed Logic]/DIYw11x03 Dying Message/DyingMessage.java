import java.util.Scanner;
import java.util.Arrays;

public class DyingMessage {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int i, j;
        
        int dcyfrSize = sc.nextInt();
        sc.nextLine();
        String enCodeText = sc.nextLine();
        int[] enCodeNum = new int[dcyfrSize];
        for (i=0; i<dcyfrSize; i++){
            enCodeNum[i] = sc.nextInt();
        }
        
        int[] encRanked = new int[dcyfrSize];
        System.arraycopy(enCodeNum, 0, encRanked, 0, dcyfrSize);
        Arrays.sort(encRanked);

        for(i=0; i<dcyfrSize; i++){
            for(j=0; j<dcyfrSize; j++){
                if(encRanked[i] == enCodeNum[j]){
                    System.out.print(enCodeText.charAt(j));
                }
            }
        }
        
        // resource leak closing and waiting for input
        DyingMessage.main(args);
        sc.close();

    }
}

