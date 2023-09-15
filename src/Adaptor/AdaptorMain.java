package Adaptor;

public class AdaptorMain {
    public static void main(String[] args) {
        Fire YoonK2 = new FireK2C1(new K2C1("169967"));
        YoonK2.Single();
        YoonK2.Burst();
        YoonK2.FullAuto();

        Fire ChoiK2 = new FireK2C1(new K2C1("216005"));
        ChoiK2.Single();
        ChoiK2.Burst();
        ChoiK2.FullAuto();


    }
}
