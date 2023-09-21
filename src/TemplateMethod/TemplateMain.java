package TemplateMethod;

public class TemplateMain {
    public static void main(String[] args) {
        BeverageTemplate coffee = new Coffee();
        BeverageTemplate tea = new Tea();

        System.out.println("커피 만들기");
        coffee.prepareBeverage();

        System.out.println("\n차 만들기");
        tea.prepareBeverage();
    }
}
