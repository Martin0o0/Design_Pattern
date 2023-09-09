package FactoryMethod;

//구상 Product
public class Pistol implements Gun{

    public Pistol(){
        System.out.println("권총 1정 생성");
    }

    @Override
    public void fire() {
        System.out.println("권총 사격 개시");
    }

    @Override
    public void reload() {
        System.out.println("권총 재장전");

    }
}
