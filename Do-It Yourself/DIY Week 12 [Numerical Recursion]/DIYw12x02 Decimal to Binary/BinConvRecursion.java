import java.util.Scanner;

public class BinConvRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinConvRecursion dec = new BinConvRecursion(); 
        System.out.println(dec.binConv(sc.nextInt()));
    }

    public int binConv(int n){
        if(n==0){
            return 0;
        }
        else{
            return n%2 + 10 * binConv(n/2);
        }
    }
}
