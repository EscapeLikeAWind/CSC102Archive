public class Circle {
    
    //Exercise 1
    private double radius;
    private double xcoor;
    private double ycoor;
    private final double PI = Math.PI;
    // Exercise 3.1
    public static int circleCounter;
    
    public Circle(){
        circleCounter++;
    }
    //  Exercise 4.1, 4.2
    public Circle(double radius){
        this.radius = radius;
        //c2 radius = 0.0 because ref to local "radius" instead
        //this radius ref to actual c2 instance "radius"
        circleCounter++;
    }
    public Circle(double r, double x, double y){
        radius = r;
        xcoor = x;
        ycoor = y;
        circleCounter++;
    }
    
    public void setRadius(double r){
        radius = r;
    }
    public double getRadius(){
        return radius;
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
    public double getDiameter(){
        double diameter = 2*radius;
        return diameter;
    }
    
    public void setCenter(double x, double y){
        xcoor = x;
        ycoor = y;
    }
    
    public String getCenter(){
        return xcoor + "," + ycoor;
    }
    public double getAreaOfCircles(int n){
        return n*getArea();
    }
    public void printInfo(){
        System.out.println("The circle have:");
        System.out.println("radius = "+radius);
        System.out.println("area = "+getArea());
        System.out.println("area = "+getPerimeter());
        System.out.println("diameter = "+getDiameter());
        System.out.println("coordinate = ("+xcoor+","+ycoor+")");
    }
}  
