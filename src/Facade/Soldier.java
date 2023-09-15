package Facade;


public class Soldier {

    public void readyToFire(){
        System.out.println("사수, 소총 거치 후 엎드려 쏴 준비");
    }

    public void getMag(){
        System.out.println("사수, 탄알집 인계");
    }

    public void reload(){
        System.out.println("사수, 탄알집 결합");
    }

    public void setSingle(){
        System.out.println("사수, 조정간 단발");
    }

    public void setBoltForward(){
        System.out.println("사수, 노리쇠 전진");
    }

    public void fire(){
        System.out.println("일제히 격발");
    }

    public void finishFire(){
        System.out.println("사수, 소총 내려놓고 앉아서 대기");
    }

}
