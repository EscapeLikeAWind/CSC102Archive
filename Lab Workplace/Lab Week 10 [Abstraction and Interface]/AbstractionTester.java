public class AbstractionTester {
    public static void main(String[] args){
        
        //Exercise 4

        /* instantiation failed due to "vague" nature of abstract content unable to be "object"ify
        GeometricObject g1 = new GeometricObject();*/

        Circle c1 = new Circle();
        c1.setRadius(5.0);
        c1.setColor("green");
        c1.setFilled(false);
        System.out.println(c1.getRadius());
        System.out.println(c1.getColor());
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        
        Rectangle r1 = new Rectangle();
        r1.setWidthHeight(5, 10);
        r1.setColor("yellow");
        r1.setFilled(true);
        System.out.println(r1.getWidth());
        System.out.println(r1.getHeight());
        System.out.println(r1.getColor());
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());

        System.out.println();
        c1.setRadius(2.5);
        System.out.println(c1.getRadius());

    }
}
