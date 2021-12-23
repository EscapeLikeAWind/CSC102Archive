import java.util.Scanner;

public class WordSearchModImperative{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[][] words = new String[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                words[i][j] = sc.next();
            }
        }
        int k = sc.nextInt();
        String[] searchWords = new String[k];
        boolean[] isSearchWords = new boolean[k];
        for (int i = 0; i < k; i++){
            searchWords[i] = sc.next();
        }
        sc.close();


        for (int index = 0; index < k; index++) {
            String word = searchWords[index];
            int wordLength = word.length();
            //left to right search**
            for (int i = 0; i < n; i++){
                for (int j = 0; j <= m-wordLength; j++) {
                    String str = "";
                    for (int l = 0; l < wordLength; l++){
                        str += words[i][j+l];
                    }
                    if (str.equals(word)){
                        isSearchWords[index] = true;
                    }
                }
            }
            //right to left search**
            for (int i = 0; i<n; i++){
                for (int j = m-1; j >= wordLength-1; j--) {
                    String str = "";
                    for (int l = 0; l < wordLength; l++){
                        str += words[i][j-l];
                    }
                    if (str.equals(word)){
                        isSearchWords[index] = true;
                    }
                }
            }
            //top to bottom search**
            for (int j = 0; j < m; j++) {
                for (int i = 0; i <= n-wordLength; i++){
                    String str = "";
                    for (int l = 0; l < wordLength; l++){
                        str += words[i+l][j];
                    }
                    if (str.equals(word)){
                        isSearchWords[index] = true;
                    }
                }
            }
            //bottom to top search**
            for (int j = 0; j < m; j++) {
                for (int i = n-1; i >= wordLength-1; i--){
                    String str = "";
                    for (int l = 0; l < wordLength; l++){
                        str += words[i-l][j];
                    }
                    if (str.equals(word)){
                        isSearchWords[index] = true;
                    }
                }
            }
            //diagonal search: top left to bottom right**
            for (int j = 0; j <= m-wordLength; j++) {
                for (int i = 0; i <= n-wordLength; i++){
                    String str = "";
                    for (int l = 0; l < wordLength; l++){
                        str += words[i+l][j+l];
                    }
                    if (str.equals(word)){
                        isSearchWords[index] = true;
                    }
                }
            }
            //diagonal search: bottom left to top right**
            for (int j = 0; j <= m-wordLength; j++) {
                for (int i = n-1; i >= wordLength-1; i--){
                    String str = "";
                    for (int l = 0; l < wordLength; l++){
                        str += words[i-l][j+l];
                    }
                    if (str.equals(word)){
                        isSearchWords[index] = true;
                    }
                }
            }
            //diagonal search: top right to bottom left**
            for (int j = m-1; j >= wordLength-1; j--) {
                for (int i = 0; i <= n-wordLength; i++){
                    String str = "";
                    for (int l = 0; l < wordLength; l++){
                        str += words[i+l][j-l];
                    }
                    if (str.equals(word)){
                        isSearchWords[index] = true;
                    }
                }
            }
            // diagonal search: bottom right to top left**
            for (int j = m-1; j >= wordLength-1; j--) {
                for (int i = n-1; i >= wordLength-1; i--){
                    String str = "";
                    for (int l = 0; l < wordLength; l++){
                        str += words[i-l][j-l];
                    }
                    if (str.equals(word)){
                        isSearchWords[index] = true;
                    }
                }
            }
        }


        for (int i = 0; i < k; i++) {
            if (isSearchWords[i] == true){
                System.out.println(searchWords[i] + " found");
            }
            else{
                System.out.println(searchWords[i] + " not found");
            }
        }
    }
}

// This code is solely implemented by Khush Agarwal, CS@SIT KMUTT