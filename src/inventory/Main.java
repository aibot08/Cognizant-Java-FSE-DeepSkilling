package inventory;

public class Main {

    public static void main(String[] args) {

        InventoryManagementSystem inventory = new InventoryManagementSystem();

        Product p1 = new Product(101, "Laptop", 20, 65000);
        Product p2 = new Product(102, "Mouse", 100, 500);
        Product p3 = new Product(103, "Keyboard", 50, 900);

        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);

        System.out.println("\n===== INVENTORY =====");
        inventory.displayProducts();

        inventory.updateProduct(102, 150);

        System.out.println("\n===== AFTER UPDATE =====");
        inventory.displayProducts();

        inventory.deleteProduct(103);

        System.out.println("\n===== AFTER DELETE =====");
        inventory.displayProducts();
    }
}