package sparta.enumtype;

// Functional interface 정의
interface Changeable {
    boolean isChangeable();
}

public enum OrderStatus {
    DELIVERY_COMPLETED(() -> true),
    PRODUCT_DELIVERY(() -> true),
    PRODUCT_ORDER(() -> true),
    PURCHASE_DECISION(() -> true),
    RESEND(() -> true);

    // 필드 정의
    private final Changeable changeable;

    // 생성자 정의
    OrderStatus(Changeable changeable) {
        this.changeable = changeable;
    }

    // 메서드 정의
    public boolean isChangeable() {
        return changeable.isChangeable();
    }
}