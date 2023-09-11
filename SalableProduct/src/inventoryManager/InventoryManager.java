package inventoryManager;

import java.util.ArrayList;
import java.util.List;
import salableProduct.SalableProduct;

public class InventoryManager {
    private List<SalableProduct> productList = new ArrayList<>();

    public void addProduct(SalableProduct product) {
        productList.add(product);
    }

    public List<SalableProduct> getProductList() {
        return productList;
    }

    public SalableProduct findProductByName(String productName) {
        for (SalableProduct product : productList) {
            if (product.getName().equalsIgnoreCase(productName)) {
                return product;
            }
        }
        return null; // Product not found
    }
}