package Decorator;

public class LGNat extends Decorator{
    public LGNat(KHU khu){
        super(khu);
    }

    @Override
    public void whatCollege() {
        super.whatCollege();
        System.out.println("Installing a LG U+ NAT");
    }
}
