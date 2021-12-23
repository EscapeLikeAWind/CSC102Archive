public class Customer {
    
    //Exercise 1
    private String firstname;
    private String lastname;
    private int customerid;

    Customer(String fn, String ln, int cusId){
        firstname = fn;
        lastname = ln;
        customerid = cusId;
    }

    public String getFirstname(){
        return firstname;
    }
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    public int getCustomerId(){
        return customerid;
    }
    public void setCustomerId(int customerid){
        this.customerid = customerid;
    }

}
