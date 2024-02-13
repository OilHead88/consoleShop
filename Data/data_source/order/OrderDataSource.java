package MyProject6OnlineShop.Data.data_source.order;

import MyProject6OnlineShop.Data.models.Order;

public abstract class OrderDataSource {
    private Order order;
    public abstract void createOrder(Order order);
    public abstract Order getOrder();
}
