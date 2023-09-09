package FactoryMethod;

//구상 Product
public class Rifle implements Gun{

    public Rifle(){
        System.out.println("소총 1정 생성");
    }

    @Override
    public void fire() {
        System.out.println("소총 사격 개시");
    }

    @Override
    public void reload() {
        System.out.println("소총 재장전");
    }
}
