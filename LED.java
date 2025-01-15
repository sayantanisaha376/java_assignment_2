/* Create a java class LED having id brand and price.
   Now create 2 OLED as Sony and Samsung now compare their price and the higher priced tv name should be 
   changed to Premium Model then print all to console. */
   
   
class LED {
    private int id;
    private String brand;
    private double price;

     // Getters&Setters
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
	
    public String getBrand() {
        return this.brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
	
    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // Method to display LED details
    public void displayDetails() {
        System.out.println("ID: " + id + ", Brand: " + brand + ", Price: Rs." + price);
    }

    public static void main(String[] args) {
        // Create two OLED objects
        LED sony = new LED();
        sony.setId(1);
        sony.setBrand("Sony");
        sony.setPrice(18000.50);

        LED samsung = new LED();
        samsung.setId(2);
        samsung.setBrand("Samsung");
        samsung.setPrice(14000.75);

        // Compare prices and update the brand of the higher-priced TV
        if (sony.getPrice() < samsung.getPrice()) {
            sony.setBrand("Premium Model");
        } else if (sony.getPrice() > samsung.getPrice()) {
            samsung.setBrand("Premium Model");
        }

        // Print details of both TVs
        System.out.println("TV Details:");
        sony.displayDetails();
        samsung.displayDetails();
    }
}
   
