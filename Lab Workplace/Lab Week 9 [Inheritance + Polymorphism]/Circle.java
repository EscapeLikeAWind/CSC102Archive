public class Circle extends GeometricObject {
    
    //Exercise 2
    private double radius;
    private double PI = Math.PI;

    public Circle(){
        this(1.0);
    }
    public Circle(double radius){
        this(radius, "white", true);
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        //use power exponent instead
        double area = PI*Math.pow(radius, 2);
        return area;
    }
    public double getPerimeter(){
        double perimeter = 2*PI*radius;
        return perimeter;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("It is a circle with radius of " + radius);
    }
    
}
