package inventory;

import java.util.ArrayList;

public class InventoryManagementSystem {

    private ArrayList<Product> products;

    public InventoryManagementSystem() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product Added Successfully!");
    }

    public void displayProducts() {

        if (products.isEmpty()) {
            System.out.println("No Products Available!");
            return;
        }

        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void updateProduct(int productId, int quantity) {

        for (Product product : products) {

            if (product.getProductId() == productId) {

                product.setQuantity(quantity);

                System.out.println("Product Updated Successfully!");
                return;
            }
        }

        System.out.println("Product Not Found!");
    }

    public void deleteProduct(int productId) {

        Product removeProduct = null;

        for (Product product : products) {

            if (product.getProductId() == productId) {
                removeProduct = product;
                break;
            }
        }

        if (removeProduct != null) {
            products.remove(removeProduct);
            System.out.println("Product Deleted Successfully!");
        } else {
            System.out.println("Product Not Found!");
        }
    }
}
