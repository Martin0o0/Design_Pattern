package State;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        order.processOrder(); // 주문이 신규 주문에서 배송 중으로 변경됨
        order.processOrder(); // 주문이 배송 중에서 배송 완료로 변경됨
        order.processOrder(); // 주문이 배송 완료 상태로 변경됨
    }
}