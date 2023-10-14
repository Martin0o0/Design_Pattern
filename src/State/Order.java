package State;

public class Order {
    OrderState orderState;

    public Order() {
        setState(new NewOrderState());
    }

    public void setState(OrderState state) {
        this.orderState = state;
    }

    public void processOrder() {
        orderState.processOrder(this);
    }

}