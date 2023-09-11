package shoppingCart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import salableProduct.SalableProduct;

public class ShoppingCart {
    private Map<SalableProduct, Integer> cartItems = new HashMap<>();
    private double totalPrice = 0.0; // Running total of item prices

    public void addProduct(SalableProduct product, int quantity) {
        int currentQuantity = cartItems.getOrDefault(product, 0);
        cartItems.put(product, currentQuantity + quantity);
        totalPrice += product.getPrice() * quantity; // Add the price to the running total
        System.out.println("Added " + quantity + " " + product.getName() + " to cart. Total price: $" + String.format("%.2f", totalPrice));
    }

    public void removeProduct(SalableProduct product, int quantity) {
        if (cartItems.containsKey(product)) {
            int currentQuantity = cartItems.get(product);
            if (currentQuantity > quantity) {
                cartItems.put(product, currentQuantity - quantity);
                totalPrice -= product.getPrice() * quantity; // Subtract the price from the running total
                System.out.println("Removed " + quantity + " " + product.getName() + " from cart. Total price: $" + String.format("%.2f", totalPrice));
            } else if (currentQuantity == quantity) {
                cartItems.remove(product);
                totalPrice -= product.getPrice() * quantity; // Subtract the price from the running total
                System.out.println("Removed " + quantity + " " + product.getName() + " from cart. Total price: $" + String.format("%.2f", totalPrice));
            } else {
                System.out.println("Invalid quantity to remove.");
            }
        }
    }

    public List<SalableProduct> getCartItems() {
        return new ArrayList<>(cartItems.keySet());
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getQuantityInCart(SalableProduct product) {
        return cartItems.getOrDefault(product, 0);
    }

    public SalableProduct findProductByName(String productName) {
        for (SalableProduct product : cartItems.keySet()) {
            if (product.getName().equalsIgnoreCase(productName)) {
                return product;
            }
        }
        return null; // Product not found
    }

    // Other methods for managing the shopping cart
}
