package Adaptor;

public class FireK2C1 implements Fire{

    private K2C1 k2C1;

    public FireK2C1(K2C1 k2C1){
        this.k2C1 = k2C1;
    }

    @Override
    public void Single() {
        this.k2C1.조정간단발();
    }

    @Override
    public void Burst() {
        this.k2C1.조정간점사();
    }

    @Override
    public void FullAuto() {
        this.k2C1.조정간연사();
    }
}
