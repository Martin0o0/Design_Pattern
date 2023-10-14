package Composite;

import java.util.ArrayList;
import java.util.List;

public class Category extends ProductCategory {

    List<ProductCategory> productCategories;

    public Category(int productId, String name) {
        super(productId, name);
        productCategories = new ArrayList<>();
    }

    @Override
    public void addProduct(ProductCategory productCategory) {
        this.productCategories.add(productCategory);
    }

    @Override
    public void removeProduct(ProductCategory productCategory) {
        this.productCategories.removeIf(temp -> temp.getProductId() == productCategory.getProductId());
    }

    @Override
    public int getCount() {
        return productCategories.size();
    }

    @Deprecated
    @Override
    public int getProductId() {
        return 0;
    }

    @Override
    public String getName() {
        return productCategories.toString();
    }
}
