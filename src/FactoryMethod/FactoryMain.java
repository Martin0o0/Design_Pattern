package FactoryMethod;

public class FactoryMain {
    public static void main(String[] args) {
        GunFactory gunFactory1 = new RifleFactory();
        Gun rifle = gunFactory1.createGun();
        rifle.fire();
        rifle.reload();


        GunFactory gunFactory2 = new PistolFactory();
        Gun pistol = gunFactory2.createGun();
        pistol.fire();
        pistol.reload();
    }
}
