import java.util.*;

class Product {
    String productName;
    double price;
    int quantity;

    Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String toString() {
        return productName + " x" + quantity + " = "
               + (price * quantity);
    }
}

class Order {
    String orderId;
    List<Product> products = new ArrayList<>();

    Order(String orderId) {
        this.orderId = orderId;
    }

    void addProduct(Product p) {
        products.add(p);
    }

    double calculateTotal() {
        double total = 0;

        for (Product p : products)
            total += p.price * p.quantity;

        return total;
    }

    public String toString() {
        String result = "Order ID: " + orderId + "\nProducts:\n";

        for (Product p : products)
            result += p + "\n";

        result += "Total: " + calculateTotal();

        return result;
    }
}

public class Q4_ShoppingCart {
    public static void main(String[] args) {

        Order order = new Order("ORD101");

        order.addProduct(new Product("Laptop", 50000, 1));
        order.addProduct(new Product("Mouse", 500, 2));
        order.addProduct(new Product("Keyboard", 1500, 1));

        System.out.println(order);
    }
}