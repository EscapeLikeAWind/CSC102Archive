//Input 33 39 80 56 83 -1
//Output 33 39 56 80 83
//       83 80 56 39 33

import java.util.*;

public class LinkedListSorting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> posInt = new LinkedList<Integer>();
        int id = sc.nextInt();
        while (id != -1){
            posInt.add(id);
            id = sc.nextInt();
        }
        sc.close();
        
        Collections.sort(posInt);
        ListIterator<Integer> itr = posInt.listIterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        while (itr.hasPrevious()){
            System.out.print(itr.previous() + " ");
        }
    } 
}
