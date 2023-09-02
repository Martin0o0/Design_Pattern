package Decorator;

public class SKTNat extends Decorator {
    public SKTNat(KHU khu){
        super(khu);
    }

    @Override
    public void whatCollege() {
        super.whatCollege();
        System.out.println("Installing a SKT NAT");
    }
}
