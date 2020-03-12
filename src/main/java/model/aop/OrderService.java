package model.aop;

public interface OrderService {
    /**
     * 创建订单
     * @param name
     * @return
     */
    Order createOrder(String name);


    /**
     * 查询订单
     * @return
     */
    Order queryOrder();
}
