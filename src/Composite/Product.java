package Composite;

//leaf
public class Product extends ProductCategory{
    public Product(int productId, String name) {
        super(productId, name);
    }

    @Override
    public void addProduct(ProductCategory productCategory) {
        //리프에서는 수행안됨
    }

    @Override
    public void removeProduct(ProductCategory productCategory) {
        //리프에서는 수행 안됨
    }

    @Override
    public int getCount() {
        return 1; //리프는 오직 수량이 하나다.
    }

    @Override
    public int getProductId() {
        return super.productId;
    }

    @Override
    public String getName() {
        return super.name;
    }
}
