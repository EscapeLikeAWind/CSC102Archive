import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FibonacciRecursion fib = new FibonacciRecursion(); 
        System.out.println(fib.fibonacci(sc.nextInt()));
    }

    public int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}

