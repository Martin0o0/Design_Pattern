package State;

public class DeliveredOrderState implements OrderState {

    @Override
    public void processOrder(Order order) {
        System.out.println("주문이 배송 완료되었습니다. 주문 완료 상태입니다.");
    }

}