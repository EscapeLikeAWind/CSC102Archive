import java.util.Scanner;

public class XCrossDrawing{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        sc.close();

        if(word.length()%2 == 0){
            System.out.print("Invalid word input");
            return;
        }
        
        for(int i=0; i<word.length(); i++){
            String invisible = new String(new char[word.length()]);
            StringBuilder str = new StringBuilder(invisible);
            str.setCharAt(i, word.charAt(i));
            str.setCharAt(word.length()-1-i, word.charAt(word.length()-1-i));
            System.out.println(str.toString());
        }

    }
}