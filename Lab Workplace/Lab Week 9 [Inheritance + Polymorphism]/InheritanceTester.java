public class InheritanceTester {
    
    //Exercise 4 
    public static void main(String[] args){
        
        InheritanceTester tester = new InheritanceTester();
        
        GeometricObject g1 = new GeometricObject();
        g1.printInfo();
        tester.printGeometricInfo(g1);
        
        Circle c1 = new Circle();
        c1.printInfo();
        //sub class polymorphism
        tester.printGeometricInfo(c1);

        Rectangle r1 = new Rectangle();
        r1.printInfo();
        //sub class polymorphism
        tester.printGeometricInfo(r1);
        
    }

    public void printGeometricInfo(GeometricObject g){
        g.printInfo();
    }

}
