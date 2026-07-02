package ecommerce;

public class Main {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Keyboard", "Electronics")
        };

        Product linear = SearchFunction.linearSearch(products, 103);

        System.out.println("===== Linear Search =====");

        if (linear != null)
            System.out.println(linear);
        else
            System.out.println("Product Not Found");

        Product binary = SearchFunction.binarySearch(products, 104);

        System.out.println("\n===== Binary Search =====");

        if (binary != null)
            System.out.println(binary);
        else
            System.out.println("Product Not Found");
    }
}
