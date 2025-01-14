class Mobile {
    private String brand;
    private String model;
    private String operatingSystem;

    // Constructor
    public Mobile(String brand, String model, String operatingSystem) {
        this.brand = brand;
        this.model = model;
        this.operatingSystem = operatingSystem;
    }

    // Getter and Setter methods
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    // Method to display mobile details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("OS: " + operatingSystem);
    }
}

class Shop {
    private Mobile[] mobiles = new Mobile[3]; // Fixed size array to store mobiles
    private int count = 0; // To keep track of the number of mobiles added

    // Method to add a mobile to the shop
    public void addMobile(Mobile mobile) {
        if (count < mobiles.length) {
            mobiles[count] = mobile;
            count++;
        } else {
            System.out.println("Shop is full, cannot add more mobiles.");
        }
    }

    // Method to sell a mobile based on brand and operating system
    public Mobile sellMobile(String brand, String operatingSystem) {
        for (int i = 0; i < count; i++) {
            if (mobiles[i].getBrand().equalsIgnoreCase(brand) && mobiles[i].getOperatingSystem().equalsIgnoreCase(operatingSystem)) {
                Mobile soldMobile = mobiles[i];
                // Shift the remaining mobiles to the left
                for (int j = i; j < count - 1; j++) {
                    mobiles[j] = mobiles[j + 1];
                }
                count--;
                return soldMobile;
            }
        }
        return null;
    }

    // Method to display available mobiles in the shop
    public void displayAvailableMobiles() {
        System.out.println("Available Mobiles:");
        for (int i = 0; i < count; i++) {
            mobiles[i].displayDetails();
            System.out.println();
        }
    }
}

class Customer {
    private String name;

    // Constructor
    public Customer(String name) {
        this.name = name;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Method for the customer to visit the shop and purchase a mobile
    public void visitShopAndPurchaseMobile(Shop shop, String brand, String operatingSystem) {
        System.out.println(name + " is visiting the shop to purchase a " + brand + " mobile with " + operatingSystem);
        Mobile purchasedMobile = shop.sellMobile(brand, operatingSystem);
        if (purchasedMobile != null) {
            System.out.println(name + " purchased: ");
            purchasedMobile.displayDetails();
        } else {
            System.out.println("No " + brand + " mobile with " + operatingSystem + " found.");
        }
    }
}

class MobileShop {
    public static void main(String[] args) {
        // Create shop and add mobiles
        Shop shop = new Shop();
        Mobile vivo = new Mobile("AppleIphone", "iphone16", "iOS");
        Mobile samsung = new Mobile("Samsung", "Galaxy S21", "Android 14");
        Mobile onePlus = new Mobile("VIVO", "V21", "Android 15");

        shop.addMobile(vivo);
        shop.addMobile(samsung);
        shop.addMobile(onePlus);

        // Display available mobiles in the shop
        shop.displayAvailableMobiles();
        System.out.println("------------------------------------------------------------------------------------------------");
        // Create customer and visit shop to purchase a VIVO mobile with Android 15
        Customer customer = new Customer("Sayantani");
        customer.visitShopAndPurchaseMobile(shop, "VIVO", "Android 15");
    }
}
