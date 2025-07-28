package ecom;



import java.util.ArrayList;
import java.util.List;

public class ProductController {

    private List<Product> productList = new ArrayList<>();
    private ProductView view;

    public ProductController(ProductView view) {
        this.view = view;
    }

    public void addProduct(int id, String name, double price) {
        Product p = new Product(id, name, price);
        productList.add(p);
        view.displayMessage("✅ Product added successfully.");
    }

    public void displayAllProducts() {
        view.displayAllProducts(productList);
    }

    public void searchProduct(int id) {
        for (Product p : productList) {
            if (p.getId() == id) {
                view.displayProduct(p);
                return;
            }
        }
        view.displayMessage("❌ Product not found.");
    }
}

