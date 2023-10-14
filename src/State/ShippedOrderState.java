package State;

public class ShippedOrderState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("주문이 배송 중입니다. 배송 완료 상태로 변경합니다.");
        order.setState(new DeliveredOrderState());
    }
}
