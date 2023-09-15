package Facade;

public class FacadeMain {
    public static void main(String[] args) {
        FireTrainingFacade trainingCamp = new FireTrainingFacade();
        trainingCamp.readyToFirstFire();
        trainingCamp.FirstFire();
        trainingCamp.readyToSecondFire();
        trainingCamp.SecondFire();
        trainingCamp.FinishFire();
    }
}
