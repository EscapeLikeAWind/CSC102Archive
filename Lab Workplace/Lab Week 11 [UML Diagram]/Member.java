public class Member extends Customer {
    
    //Exercise 2
    private double points;

    Member(String fn, String ln, int cusId){
        super(fn, ln, cusId);
        points = 0;
    }

    public double getPoints(){
        return points;
    }
    public void setPoints(double shoppingAmount){
        points = points + (shoppingAmount/1000);
    }
    public double convertPoints(double p){
        double converted = p*20;
        points = points - p;
        return converted;
    }

}
