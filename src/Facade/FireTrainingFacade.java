package Facade;

public class FireTrainingFacade {

    private Soldier soldier;
    private K2 k2;
    private Target target;

    public FireTrainingFacade(){
        this.soldier = new Soldier();
        this.k2 = new K2();
        this.target = new Target();
    }

    public void readyToFirstFire(){
        soldier.readyToFire();
        soldier.getMag();
        soldier.reload();
        k2.setAmmo();
        soldier.setSingle();
        k2.single();
        soldier.setBoltForward();
    }

    public void FirstFire(){
        soldier.fire();
        k2.Fire();
        target.hit30M();
        k2.Fire();
        target.hit50M();
        k2.Safe();
    }
    public void readyToSecondFire(){
        soldier.getMag();
        soldier.reload();
        k2.setAmmo();
        soldier.setSingle();
        k2.single();
        soldier.setBoltForward();
    }


    public void SecondFire(){
        soldier.fire();
        k2.Fire();
        target.hit100M();
        k2.Fire();
        target.hit200M();
        k2.Safe();
    }

    public void FinishFire(){
        soldier.finishFire();
    }


}
