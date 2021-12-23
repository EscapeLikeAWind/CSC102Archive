//DIYw5x02 Manual Array Sorting (Quicksort Min-Max)
// *no 0 or repetitive postive number on input
//input 10                             output 15 19 23 28 37 51 54 69 78 84
//      54 37 15 28 51 69 78 19 23 84
import java.util.Scanner;

public class ManualArraySorting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ipSize = sc.nextInt();
        int[] arInput = new int[ipSize];
        int[] arOutput = new int[ipSize];
        for(int i=0; i<ipSize; i++){
            arInput[i] = sc.nextInt();
        }
        sc.close();

        inputTraversal:
        for(int i=0; i<ipSize-1; i++){
            int pointer = arInput[i];
            int x = i + 1;
            int ahead = arInput[x];
            while(pointer > ahead) {
                x++;
                if (pointer > ahead){
                    arOutput[x] = pointer;
                    break;
                }
            }
            if(pointer < ahead) {
                for(int j=0; j<ipSize; j++){
                    if (arOutput[0] == 0){
                        arOutput[0] = pointer;
                        break;
                    }
                    while (arOutput[j] < pointer){
                        if(arOutput[j] == 0){
                            arOutput[j] = pointer;
                            break;
                        } 
                        j++;
                    }
                    if(arOutput[j] > pointer){
                        int y = j + 1;
                        while(arOutput[j] > arOutput[y]){
                            if(arOutput[y] == 0){
                                arOutput[y] = arOutput[j];
                                arOutput[j] = pointer;
                                continue inputTraversal;
                            }
                            if(arOutput[y] != 0){
                                int tempJ = arOutput[j];
                                int tempY = arOutput[y];
                            }
                            if(y == ipSize -1){
                                break;
                            } else {
                                y++;
                            }
                        }
                    }
                    
                }
            }
        }

        for (int i=0; i<ipSize; i++){
            System.out.print(arOutput[i] + " ");
        }
    }
}
