//Input 5
//      10
//      2 3 4 5 6 7 19 20 82 90
//Output 0 2
//       Everyone receive the gifts.

import java.util.*;

public class ArtistGift {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int artists = sc.nextInt();
        int gifts = sc.nextInt();
        Map<Integer, Integer> artistGift = new HashMap<Integer, Integer>();
        for(int i=0; i<artists; i++){
            artistGift.put(i, 0);
        }
        for(int i=0; i<gifts; i++){
            int tag = sc.nextInt();
            for(int j=0; j<artists; j++){
                if(tag%artists == j){
                    artistGift.replace(j, artistGift.get(j)+1);
                }
            }
        }
        sc.close();

        for(int i=0; i<artists; i++){
            if(artistGift.get(i) == Collections.max(artistGift.values())){
                System.out.print(i + " ");
            }
        }
        System.out.print("\n");
        if(Collections.min(artistGift.values()) != 0){
            System.out.print("Everyone receive the gifts.");
        } else {
            for(int i=0; i<artists; i++){
                if(artistGift.get(i) == 0){
                    System.out.print(i + " ");
                }
            }
        }
        
    }
}
