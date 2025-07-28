package ecom;



import java.util.Scanner;

public class EcommerceApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductView view = new ProductView();
        ProductController controller = new ProductController(view);

        int choice;
        do {
            System.out.println("\n--- 🛒 E-Commerce Menu ---");
            System.out.println("1. Add Product");
            System.out.println("2. Display All Products");
            System.out.println("3. Search Product by ID");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Product Price: ");
                    double price = sc.nextDouble();
                    controller.addProduct(id, name, price);
                    break;
                case 2:
                    controller.displayAllProducts();
                    break;
                case 3:
                    System.out.print("Enter Product ID to search: ");
                    int searchId = sc.nextInt();
                    controller.searchProduct(searchId);
                    break;
                case 4:
                    System.out.println("👋 Exiting application. Thank you!");
                    break;
                default:
                    System.out.println("⚠️ Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}

