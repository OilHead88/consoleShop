package MyProject6OnlineShop.view;

import MyProject6OnlineShop.Data.models.CartItem;
import MyProject6OnlineShop.Data.models.Product;
import MyProject6OnlineShop.Data.service.ShopService;
import MyProject6OnlineShop.common.AppView;

import java.util.ArrayList;

public class CartView extends AppView {
    final ShopService shopService;


    public CartView(ShopService shopService) {
        super("Корзина", new ArrayList<>());
        this.shopService = shopService;
    }


    @Override
    public void Action() {
        ArrayList<CartItem> cart = shopService.getCart();
        if (cart.isEmpty()) {
            System.out.println("Корзина пуста");
        }else {
            for (CartItem cartItem : cart) {
                System.out.println(cartItem.product.id + " " + cartItem.product.title + " " + cartItem.count);

            }
            System.out.println();

        }

    }

}





