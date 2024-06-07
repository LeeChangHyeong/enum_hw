package sparta;

import sparta.enumtype.OrderStatus;

public class Order {
    private String productName;
    private OrderStatus status;

    public boolean isChangeable(OrderStatus nextStatus) {
        return nextStatus.isChangeable();
    }
}
