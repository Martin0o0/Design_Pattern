package Composite;

public abstract class ProductCategory {
    int productId;
    String name;

    public ProductCategory(int productId, String name){
        this.productId = productId;
        this.name = name;
    }


    public abstract void addProduct(ProductCategory productCategory);
    public abstract void removeProduct(ProductCategory productCategory);
    public abstract int getCount();

    public abstract int getProductId();

    public abstract String getName();


}
