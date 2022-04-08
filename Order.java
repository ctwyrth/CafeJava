import java.util.ArrayList;

public class Order {
   // member variables
   private String name = new String();
   private boolean ready;
   private ArrayList<Item> items;

   // constructors
   public Order() {
      name = "Guest";
      items = new ArrayList<Item>();
   }

   public Order(String name) {
      this.name = name;
      items = new ArrayList<Item>();
   }

   // getters & setters
   public String getOrderName() {
      return name;
   }
   public void setOrderName(String name) {
      this.name = name;
   }

   public boolean isReady() {
      return ready;
   }
   public void setReady(boolean status) {
      ready = status;
   }

   public ArrayList<Item> getItems() {
      return items;
   }
   public void setItems(Item item) {
      items.add(item);
   }

   // methods
   public void addItem(Item item) {
      this.setItems(item);
   }

   public String getStatusMessage() {
      if (ready) {
         return "Your order is ready!";
      } else {
         return "Thank you for waiting. Your order will be ready soon.";
      }
   }

   public double getOrderTotal() {
      double total = 0.0;
      for (int i = 0; i < this.items.size(); i++) {
         total = total + this.items.get(i).getItemPrice();
      }
      return total;
   }

   public void display() {
      System.out.printf("Customer Name: %s\n", this.getOrderName());
      for (int i = 0; i < this.items.size(); i++) {
         System.out.printf("%s - $%.2f\n", this.items.get(i).getItemName(), this.items.get(i).getItemPrice());
      }
      System.out.printf("Total: $%.2f\n", this.getOrderTotal());
   }
}