package MyProject6OnlineShop.Data.data_source.cart;

import MyProject6OnlineShop.Data.models.CartItem;
import MyProject6OnlineShop.Data.models.Product;

import java.util.ArrayList;

public abstract class CartDataSource {

   public abstract void addToCard(Product product, int count);
  public abstract ArrayList<CartItem> getCard();



    }


