public class Circle2 implements GeometricObjectInterface {
    
    //Exercise 5.2
    private double radius;
    private final double PI = Math.PI;

    public Circle2(){
        this(1.0);
    }
    public Circle2(double radius){
        this.radius = radius;
    }
    
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return PI*Math.pow(radius, 2);
    }
    public double getPerimeter(){
        return 2*PI*radius;
    }

}