package Decorator;

public class KTNat extends Decorator{
    public KTNat(KHU khu){
        super(khu);
    }

    @Override
    public void whatCollege() {
        super.whatCollege();
        System.out.println("Installing a KT NAT");
    }
}
