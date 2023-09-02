package Decorator;

public abstract class Decorator extends KHU{

    private KHU khu;
    public Decorator(KHU khu){
        this.khu = khu;
    }

    @Override
    public void whatCollege() {
        khu.whatCollege();
    }
}
