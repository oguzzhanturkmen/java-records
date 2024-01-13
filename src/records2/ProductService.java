package records2;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void listProducts() {
        products.forEach(product ->
                System.out.println("Name: " + product.name() + ", Price: " + product.price() + ", Stock: " + product.stock()));
    }

    public void listAvailableProducts() {
        products.stream().filter(product -> product.stock() > 0).forEach(product ->
                System.out.println("Name: " + product.name() + ", Price: " + product.price() + ", Stock: " + product.stock()));
    }
}
