//Exercise 1.2
public class MyFirstProgram{
    //This is my First Class
    public static void main(String[] args){
        //Exercise 2.1, 3.1, 3.2
        /*System.out.println("First Program");
        System.out.println("Hello Java");
        System.out.println("I love Java");**/

        //Exercise 4.1 *Casting Conversion*
        byte bite = (byte) 129;
        System.out.println(bite);
        //Exercise 4.2 *Return Negative Value*
        int intMax = 2147483647;
        int operand = 10;
        int result = intMax + operand;
        System.out.println(result);
        //Exercise 4.3
        long x1 = 20L + 010L; //Octa Num of 10: 8
        System.out.println(x1);
        long x2 = 20L + 0xf; //Last Hexadecimal: 15
        System.out.println(x2);
        long x3 = 20 + 30;
        System.out.println(x3);
        //Casting Conversion
        int x5 = (int) 20L + 0xf;
        System.out.println(x5);
        //Exercise 4.4 Character
        char c1 = 'A';
        char c1Code = 65; //ASCII
        System.out.println(c1);
        System.out.println(c1Code);
        char c2 = 'A';
        char c2Code = '\u0041'; //Unicode
        //Exercise 4.5 Boolean
        System.out.println(c2);
        System.out.println(c2Code);
        boolean a = true;
        boolean b = false; 
        System.out.println(a);
        System.out.println(b);
        if (a) {
            System.out.println("a is True");
        }
        if (!b) {
            System.out.println("b is not True");
        }
        //Exercise 5 Escape Sequence
        System.out.println("Hello \b World"); //backspace                                  
        System.out.println("Hello \t World"); //tab
        System.out.println("Hello \nWorld"); //newline
        System.out.println("HelloReWriteHello Java\rWorld"); //carriage return
        System.out.println("\"double quote\"");
        System.out.println("\'single quote\'");
        System.out.println("\\backslash comment\\");
        //Exercise 6.1 Arithmetic
        System.out.println(10 + 5);
        System.out.println(10 - 5);
        System.out.println(10 * 5);
        System.out.println(10 / 5);
        System.out.println(10 % 5);
        //Exercise 6.2 Relational
        int x = 10;
        int y = 5;
        int z = 5;
        if(x>y){
            System.out.println("x is greater than y");
        }
        else if(x!=y){
            System.out.println("x is not equal to y");
        }
        else if(x<y){
            System.out.println("x is less than y");
        } else{
            System.out.println(z);
        }
        //Exercise 6.3 Logical
        if(x>y || x==y) { //Short Circuit OR
            System.out.println("x is greater than or equal to y");
        } else if(x<y){
            System.out.println("x is less than y");
        }
        if(x>y && x==y){ //Short Circuit AND
            System.out.println("x is greater than or equal to y");
        } else if(x<y){
            System.out.println("x is less than y");
        }                           
    }
}

class MySecondProgram{

}