package MyProject6OnlineShop.Data.service;

import MyProject6OnlineShop.Data.data_source.cart.CartDataSource;
import MyProject6OnlineShop.Data.data_source.catalog.CatalogDataSource;
import MyProject6OnlineShop.Data.data_source.order.OrderDataSource;
import MyProject6OnlineShop.Data.models.CartItem;
import MyProject6OnlineShop.Data.models.Order;
import MyProject6OnlineShop.Data.models.Product;

import java.util.ArrayList;

public class ShopService {
    final CatalogDataSource catalogDataSource;
    final CartDataSource cartDataSource;
    final OrderDataSource orderDataSource;

    public ShopService(CatalogDataSource catalogDataSource, CartDataSource cartDataSource, OrderDataSource orderDataSource) {
        this.catalogDataSource = catalogDataSource;
        this.cartDataSource = cartDataSource;
        this.orderDataSource = orderDataSource;
    }

    public ArrayList<Product> getCatalog() {
        return catalogDataSource.getCatalog();

    }
public boolean addToCart(String productId, int count) {
    ArrayList<Product> products = getCatalog();
    for (Product p : products) {
        if (p.id.equals(productId)) {
            cartDataSource.addToCard(p, count);
            return true;
        }

    }
    return false;
}
public  ArrayList<CartItem>  getCart(){
return cartDataSource.getCard();
}
public void createOrder(String name, String phone, String address, String paymentType, String deliveryType){
    ArrayList<CartItem> cart = getCart();
    Order newOrder = new Order(name,phone,address,paymentType,deliveryType,cart);
    orderDataSource.createOrder(newOrder);


}



}



