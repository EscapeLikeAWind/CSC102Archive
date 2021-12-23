import java.util.Scanner;
//Exercise 1.1 Input Test: String, boolean
public class MyHelloWorld {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("need int");
        int x = sc.nextInt();
        System.out.println(x);

        //Exercise 1.2 
        System.out.println("boolean double String");
        boolean w = sc.nextBoolean();
        System.out.println(w);
        double y = sc.nextDouble(); 
        System.out.println(y); 
        String z = sc.next(); // gets a token of input, separated by space
        System.out.println(z);

        //Exercise 1.3
        System.out.println("int int int int");
        int i1 = sc.nextInt();
        System.out.println(i1); 
        int i2 = sc.nextInt(); 
        System.out.println(i2); 
        int i3 = sc.nextInt(); 
        System.out.println(i3); 
        int i4 = sc.nextInt();
        System.out.println(i4);
        sc.close();

        //Exercise 2.1
        String st1 = new String("Hello"); // full instantiation
        String st2 = "Programming"; //short instantiation
        System.out.println(st1);
        System.out.println(st2);
        //Exercise 2.2 String Manipulation
        System.out.println(st2.length());
        System.out.println(st2.charAt(3)); 
        System.out.println(st2.concat(st1)); //Contact String Concatenation
        System.out.println(st2.indexOf("a")); //find least index of valid a
        System.out.println(st2.indexOf("m", 7)); //find least index of valid m from index 7
        System.out.println(st2.substring(3)); //substring 3-end
        System.out.println(st2.substring(3, 6)); //substring index 3-6
    }        
}
