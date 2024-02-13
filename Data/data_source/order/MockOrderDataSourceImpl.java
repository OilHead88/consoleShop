package MyProject6OnlineShop.Data.data_source.order;

import MyProject6OnlineShop.Data.models.Order;

public class MockOrderDataSourceImpl extends OrderDataSource{
    private Order order;
    @Override
   public void createOrder(Order order) {
        this.order = order;

    }

    @Override
   public Order getOrder() {
        return order;
    }
}
