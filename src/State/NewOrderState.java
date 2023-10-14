package State;

public class NewOrderState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("주문이 접수되었습니다. 배송 중 상태로 변경합니다.");
        order.setState(new ShippedOrderState());
    }
}