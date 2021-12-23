public class ShoppingTest {
    public static void main(String[] args){
        //Exercise 6
        Customer julia = new Customer("Julia", "Smith", 1001);
        Member bob = new Member("Bob", "Roger", 2005);

        Product pepsi = new Product("Pepsi 1-liter", 100, 35);
        Product juice = new Product("Splash", 200, 15);
        Product milk = new Product("Nongpho", 300, 12);

        LineItem 11 = new LineItem(pepsi, 50);
        LineItem 12 = new LineItem(juice, 100);
        LineItem 13 = new LineItem(milk, 200);
        LineItem 14 = new LineItem(pepsi, 100);

        Order order1 = new Order(julia);
        order1.addLineItem(11);
        order1.addLineItem(12);
        order1.removeLineItembyArrayIndex(0);

        order1.printLineItems();
        order1.addLineItem(11);
        order1.printLineItems();

        Order order2 = new Order(bob);
        order2.addLineItem(13);
        order2.addLineItem(14);


        order2.printLineItems();

        System.out.println(order2.getTotalAmount());
        bob.setPoints(order2.getTotalAmount());
        System.out.println(bob.getPoints());

    }
}

