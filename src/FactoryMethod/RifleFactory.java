package FactoryMethod;

//구상 Creator
public class RifleFactory implements GunFactory{
    @Override
    public Gun createGun() {
        return new Rifle();
    }
}
