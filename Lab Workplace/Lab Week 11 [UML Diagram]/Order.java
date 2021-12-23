public class Order {
    
    //Exercise 5
    private int orderId;
    private LineItem lineitems[];
    private double totalAmount;
    private static int count;
    private Customer customer;
    
    public Order(Customer c){
        this.orderId = count++;
        this.totalAmount = 0;
        this.lineitems = new LineItem[20];
        this.customer = c;
    }

    public void addLineItem(LineItem lineItem, int index) {
        if(lineitems[index] == null) {
            lineitems[index] = lineItem;
            System.out.println("Add line item successfully");
        }
        else{
            System.out.println("The array is not empty. Line item cannot be added");
        }
    }
    public void addLineItem(LineItem lineItem) {
        boolean addSuccess = false;
        for(int i = 0; i<lineitems.length; i++) {
            if(lineitems[i] == null) {
                lineitems[i] = lineItem;
                addSuccess = true;
                break;
            }
        }
        if(addSuccess) {
            System.out.println("Add line item successfully.");
        }
        else{
            System.out.println("Your basket if full. Cannot add a line item.");
        } 
    }
    public void removeLineItembyArrayIndex(int index) {
        if(lineitems[index] != null) {
            lineitems[index] = null;
            System.out.println("Remove line item successfully");
        }
        else{
            System.out.println("The array is empty. Nothing removed.");
        }
    }
    public void calculateTotalAmount() {
        double sum = 0;
        for(LineItem l : lineitems) {
            if(l!=null) {
                sum = sum + l.calculateTotalAmount();
            }
        }
        totalAmount = sum;
    }
    public double getTotalAmount() {
        calculateTotalAmount();
        return totalAmount;
    }
    public double getOrderId() {
        return orderId;
    }
    public void printLineItems() {
        for(LineItem l : lineitems) {
            if(l!=null) {
                l.printDetail();
            }
        }
    }

}
