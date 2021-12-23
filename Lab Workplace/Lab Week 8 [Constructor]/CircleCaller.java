public class CircleCaller {
    public static void main(String[] args){
        
        //Exercise 2
        /*Circle c1 = new Circle();
        c1.setRadius(2.5);
        c1.setCenter(0, 8);
        c1.printInfo();*/
        
        //Exercise 3.2
        /*System.out.println(Circle.circleCounter);
        Circle c2 = new Circle();
        System.out.println(Circle.circleCounter);
        
        Circle c3 = new Circle();
        System.out.println(Circle.circleCounter);*/
        
        //Exercise 4.1
        Circle c1 = new Circle();
        System.out.println("Number of Circle created so far: " + Circle.circleCounter);
        System.out.println("---c1---");
        System.out.println("Radius: "+c1.getRadius()+"\t Center: "+c1.getCenter());
        
        Circle c2 = new Circle(5.3);
        System.out.println("Number of Circle created so far: " + Circle.circleCounter);
        System.out.println("---c2---");
        System.out.println("Radius: "+c2.getRadius()+"\t Center: "+c2.getCenter());
        
        Circle c3 = new Circle(1.2, 4, 10);
        System.out.println("Number of Circle created so far: " + Circle.circleCounter);
        System.out.println("---c3---");
        System.out.println("Radius: "+c3.getRadius()+"\t Center: "+c3.getCenter());
        
    }
}
