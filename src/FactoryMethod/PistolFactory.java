package FactoryMethod;

//구상 Creator
public class PistolFactory implements GunFactory{
    @Override
    public Gun createGun() {
        return new Pistol();
    }
}
