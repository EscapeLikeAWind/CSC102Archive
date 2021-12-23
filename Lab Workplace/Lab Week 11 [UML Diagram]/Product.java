public class Product {
    
    //Exercise 3
    private String productName;
    private int productId;
    private double price;

    public Product(String productName, int productId, double price){
        this.productName = productName;
        this.productId = productId;
        this.price = price;
    }

    public String getProductName(){
        return productName;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }
    public int getProductId(){
        return productId;
    }
    public void setProductId(int productId){
        this.productId = productId;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

}
