package records2;

public class Main {
    public static void main(String[] args) {

        ProductService productService = new ProductService();

        Product product = new Product("Laptop", 1000, 10);
        productService.addProduct(product);

        Product product2 = new Product("Phone", 500, 20);
        productService.addProduct(product2);

        Product product3 = new Product("Mouse", 50, 0);
        productService.addProduct(product3);

        System.out.println("All products: ");
        productService.listProducts();
        System.out.println("Available products: ");
        productService.listAvailableProducts();
    }
}
