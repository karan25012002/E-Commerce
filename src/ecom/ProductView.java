package ecom;



import java.util.List;

public class ProductView {

    public void displayProduct(Product p) {
        System.out.println("ID: " + p.getId() + ", Name: " + p.getName() + ", Price: ₹" + p.getPrice());
    }

    public void displayAllProducts(List<Product> products) {
        if (products.isEmpty()) {
            System.out.println("No products available.");
        } else {
            for (Product p : products) {
                displayProduct(p);
            }
        }
    }

    public void displayMessage(String msg) {
        System.out.println(msg);
    }
}

