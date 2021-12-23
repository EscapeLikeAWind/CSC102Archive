/*Input A 3
        B 3
        A -2
        0
        A */
//Output 1

import java.util.*;

public class AppleLedger{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> ledger = new HashMap<String, Integer>();

        while(sc.hasNextLine()) { 
            String line = sc.nextLine().replace(" ", "");
            if(line.equals("0")){
                break;
            }

            String person = Character.toString(line.charAt(0));
            int transAnc = Integer.parseInt(line.substring(1, line.length()));
            if(!ledger.containsKey(person)){
                ledger.put(person, transAnc);
            } else {
                ledger.replace(person, ledger.get(person) + transAnc);
            }
        }

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(ledger.get(line));    
        }
        sc.close();

    }
}