package Facade;

public class K2 {

    private int ammo;

    public K2(){
        this.ammo = 0;
    }

    void setAmmo(){
        this.ammo = 2;
    }

    void Fire(){
        System.out.println("1발 격발");
        this.ammo--;
    }


    public void single(){
        System.out.println("조정간 단발");
    }

    public void Safe(){
        System.out.println("조정간 안전");
    }
}
