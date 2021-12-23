public class InterfaceTester {
    public static void main(String[] args){
        
        //Exercise 6
        System.out.println(Circle2.color);
        /*final field color
        Circle2.color = "green";*/
        Circle2 c2 = new Circle2();
        System.out.println(c2.color);
        c2.setRadius(3);
        System.out.println(c2.getRadius()); 
        System.out.println(c2.getArea());
        System.out.println(c2.getPerimeter());
        
    }
}
