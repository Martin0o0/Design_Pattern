package TemplateMethod;

public abstract class BeverageTemplate {
    public final void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    // 하위 클래스에서 구현해야 하는 메서드
    abstract void brew();
    abstract void addCondiments();

    // 공통 메서드
    void boilWater() {
        System.out.println("물 끓이는 중");
    }

    void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

    //Hook
    boolean customerWantsCondiments() {
        return true;
    }
}
