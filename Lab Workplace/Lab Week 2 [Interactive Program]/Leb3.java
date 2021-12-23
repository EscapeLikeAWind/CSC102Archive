public class Leb3{
    public static void main(String[] args){
        //Exercise 3.1 String Comparison
        String st1 = new String("HELLO");
        String st2 = "Hello";
        System.out.println(st1 == st2);
        //Exercise 3.3
        System.out.println(st1.compareTo(st2)); //case sensitive
        System.out.println(st1.compareToIgnoreCase(st2)); //Negative = st1 comes before st2
        String st3 = new String("ape");
        String st4 = "zebra";
        System.out.println(st3.compareTo(st4)); //unicode default
        System.out.println(st4.compareTo(st3));
        String st5 = new String("ape");
        String st6 = "apple";
        System.out.println(st5.compareTo(st6)); //only e can be compare
        String st7 = new String(" ape");
        String st8 = "Ape";
        System.out.println(st7.compareTo(st8)); //Unicode space(32) - A = -33
        String st9 = new String("cat");
        String st10 = "catfish"; 
        System.out.println(st9.compareTo(st10)); //st9 out of comparison length - show diff letters instead (Negative: cat before)
        //Exercise 3.2
        st2 = st1; // st1 address reassigned
        System.out.println(st1==st2); // == address equality
        
        //Exercise 4 If-Else Statement
        int x = 10;
        if(x==10){
            System.out.println("x is equal to 10");
        } else if(x<10){
            System.out.println("x is less than 10");
        } else if(x>10 && x<50){
            System.out.println("x is greater than 10");
        } else { 
            System.out.println("x is "+ x);
        }
        System.out.println(x==10? "x is equal to 10": "x is "+x); //Compact If-Else
        
        //Exercise 5 AND, OR Operator
        int y = 1;
        boolean result1 = (y > 1) & (y++ < 10);
        System.out.println(result1);
        System.out.println(y);
        y = 1;
        boolean result2 = (y > 1) && (y++ < 10); //short circuit increment
        System.out.println(result2);
        System.out.println(y);
        
        int xx = 1;
        boolean result3 = (1 > xx) && ( 1 > xx++);
        System.out.println(result3);
        System.out.println(xx);
        xx = 1;
        boolean result4 = (1 > xx) & ( 1 > xx++);
        System.out.println(result4);
        System.out.println(xx);
        xx = 1;
        boolean result5 = (1 > xx) || ( 1 > xx++); //no effect
        System.out.println(result5);
        System.out.println(xx);
        xx = 1;
        boolean result6 = (1 > xx) | ( 1 > xx++);
        System.out.println(result6);
        System.out.println(xx);
        xx = 1;
        boolean result7 = (1 == xx) || (10 > xx++);
        System.out.println(result7);
        System.out.println(xx);
        xx = 1;
        boolean result8 = (1 == xx) | (10 > xx++);
        System.out.println(result8);
        System.out.println(xx);   
        
        //Exercise 6 Switch-Case
        int z = 7;
        switch(z){
            case 1: 
                    System.out.println("one");
                    break;
            case 2: 
                    System.out.println("two");
                    break;
            case 3:
                    System.out.println("three");
            case 4:
                    System.out.println("four");
            case 5:          
                    System.out.println("five");
            default:
                    System.out.println("no matched"); 
                    break;
        }

        String num = "four";
        switch(num){
            case "one":
                    System.out.println(1); 
                    break;
            case "two":
                    System.out.println(2); 
                    break; 
            case "three":
                    System.out.println(3); 
                    break; 
            case "four":
                    System.out.println(4); 
                    break; 
            case "five":
                    System.out.println(5); 
                    break;
            default:
                    System.out.println("no matched"); 
                    break; 
        }
    }
}