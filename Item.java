public class Item {
   // member variables
   private String name = new String();
   private double price;
   private int index;

   // constructor
   public Item(String name, double price) {
      this.name = name;
      this.price = price;
   }

   // getters & setters
   public String getItemName() {
      return name;
   }
   public void setItemName(String name) {
      this.name = name;
   }

   public double getItemPrice() {
      return price;
   }
   public void setItemPrice(double price) {
      this.price = price;
   }

   public int getItemIndex() {
      return index;
   }
   public void setItemIndex(int idx) {
      this.index = idx;
   }

   // methods
}


