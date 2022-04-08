// import java.util.ArrayList;

public class TestOrders {
   public static void main (String[] args) {
      // new coffee kiosk
      CoffeeKiosk cafeJava = new CoffeeKiosk();

      // Menu items
      Item item1 = new Item("Drip Coffee", 2.25);
      cafeJava.setMenu(item1);
      cafeJava.addMenuItem("Cappuccino", 3.25);
      Item item3 = new Item("Latte", 4.00);
      cafeJava.setMenu(item3);
      cafeJava.addMenuItem("Frapuccino", 4.50);

      //Order variables
      // Order order1 = new Order("Cindhuri");
      // order1.setReady(true);
      // Order order2 = new Order("Jimmy");
      // order2.setItems(item1);
      // order2.setReady(true);
      // Order order3 = new Order("Noah");
      // order3.setItems(item2);
      // Order order4 = new Order("Sam");
      // order4.setItems(item3);
      // order4.setItems(item3);
      // order4.setItems(item3);
      // Order order5 = new Order();
      // order5.setItems(item1);
      // order5.setItems(item3);
      // Order order6 = new Order();
      // order6.setItems(item2);
      // order6.setItems(item3);
      // order6.setItems(item4);

      // App simulations
      // System.out.println("ORDER 1 ---------->");
      // System.out.printf("Name: %s\n", order1.getOrderName());
      // System.out.printf("Total: $%.2f\n", order1.getOrderTotal());
      // System.out.println(order1.getStatusMessage());
      // System.out.println("\n");
      // System.out.println("ORDER 2 ---------->");
      // System.out.printf("Name: %s\n", order2.getOrderName());
      // System.out.printf("Total: $%.2f\n", order2.getOrderTotal());
      // System.out.println(order2.getStatusMessage());
      // System.out.println("\n");
      // System.out.println("ORDER 3 ---------->");
      // System.out.printf("Name: %s\n", order3.getOrderName());
      // System.out.printf("Total: $%.2f\n", order3.getOrderTotal());
      // System.out.println(order3.getStatusMessage());
      // System.out.println("\n");
      // System.out.println("ORDER 4 ---------->");
      // System.out.printf("Name: %s\n", order4.getOrderName());
      // System.out.printf("Total: $%.2f\n", order4.getOrderTotal());
      // System.out.println(order4.getStatusMessage());
      // System.out.println("\n");
      // System.out.println("ORDER 5 ---------->");
      // order5.display();
      // System.out.println("\n");
      // System.out.println("ORDER 6 ---------->");
      // order6.display();
      cafeJava.newOrder();
   }
}
