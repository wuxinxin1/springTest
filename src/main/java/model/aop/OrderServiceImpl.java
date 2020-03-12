package model.aop;

public class OrderServiceImpl implements OrderService {
    public Order createOrder(String name) {
        System.out.println("OrderServiceImpl createOrder\n\n");
        Order order = new Order();
        order.setOrderId(125);
        return order;
    }

    public Order queryOrder() {
        System.out.println("OrderServiceImpl queryOrder\n\n");
        Order user = new Order();
        user.setOrderId(125);
        return user;
    }
}
