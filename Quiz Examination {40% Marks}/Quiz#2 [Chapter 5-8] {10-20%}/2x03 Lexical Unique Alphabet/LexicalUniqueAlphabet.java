//Input absdasdeqeuqweiwqeq
//Output A B D E I Q S U W
//      Acollectionthatcontainsnoduplicateelements
//      A C D E H I L M N O P S T U
import java.util.*;

public class LexicalUniqueAlphabet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        sc.close();
        Set<Character> s = new HashSet<Character>();

        for(char c: line.toCharArray()){
            s.add(Character.toUpperCase(c));
        }
        for(char i = 'A'; i<'Z'; i++){
            if(s.contains(i)){
                System.out.print(i + " ");
            }
        }
    }
}