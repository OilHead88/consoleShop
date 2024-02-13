package MyProject6OnlineShop.Data.data_source.cart;

import MyProject6OnlineShop.Data.models.CartItem;
import MyProject6OnlineShop.Data.models.Product;

import java.util.ArrayList;

public class MockCartDataSourceImpl extends CartDataSource{
   private ArrayList<CartItem>cart = new ArrayList<>();
    @Override
   public void addToCard(Product product, int count) {
        cart.add(new CartItem(product, count));

    }

    @Override
    public ArrayList<CartItem> getCard() {
        return cart;
    }
}
