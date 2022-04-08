import java.util.ArrayList;

public class CoffeeKiosk {
   // member variables
   private ArrayList<Item> menu;
   private ArrayList<Order> orders;
   private boolean orderComplete = false;

   // constructors
   public CoffeeKiosk() {
      menu = new ArrayList<Item>();
      orders = new ArrayList<Order>();
   }

   // getters & setters
   public ArrayList<Item> getMenu() {
      return menu;
   }
   public void setMenu(Item newItem) {
      newItem.setItemIndex(this.menu.size());
      this.menu.add(newItem);
   }

   public ArrayList<Order> getOrders() {
      return this.orders;
   }
   public void setOrders(Order newOrder) {
      this.orders.add(newOrder);
   } 

   // methods
   public void addMenuItem(String name, double price) {
      Item newItem = new Item(name, price);
      this.menu.add(newItem);
      newItem.setItemIndex(this.menu.size() - 1);
   }

   public void displayMenu() {
      for (int i = 0; i < this.menu.size(); i++) {
         Item temp = menu.get(i);
         System.out.printf("%d %s -- $%.2f\n", temp.getItemIndex(), temp.getItemName(), temp.getItemPrice());
      }
   }

   public void newOrder() {
      // Shows the user a message prompt and then sets their input to a variable, name
      System.out.println("What is the name for the new order? ");
      String name = System.console().readLine();

      Order newOrder = new Order(name);
      this.displayMenu();

      // Prompts the user to enter an item number
      // Write a while loop to collect all user's order items
      while (!this.orderComplete) {
         System.out.println("What would you like to order? Enter an item number or type 'done': ");
         String itemNumber = System.console().readLine();
         if (itemNumber.equals("done")) {
            this.orderComplete = true;
            System.out.printf("Thank you for placing your order, %s!\n", name);
         } else {
            for (int i = 0; i < this.menu.size(); i++) {
               Item temp = menu.get(i);
               if (temp.getItemIndex() == Integer.parseInt(itemNumber)) {
                  newOrder.addItem(menu.get(i));
               }
            }
         }
      }

      this.orders.add(newOrder);
      newOrder.display();
   }
}