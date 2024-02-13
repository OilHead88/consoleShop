package MyProject6OnlineShop.view;

import MyProject6OnlineShop.Data.models.Product;
import MyProject6OnlineShop.Data.service.ShopService;
import MyProject6OnlineShop.common.AppView;

import java.util.ArrayList;

public class CatalogView extends AppView {



    public CatalogView(ShopService shopService, ArrayList<AppView> children) {
        super("Каталог", children);
        this.shopService = shopService;
    }

    final ShopService shopService;


    @Override
    public void Action() {
       ArrayList<Product>catalog = shopService.getCatalog();
       for (Product product: catalog){
           System.out.println(product.id + " " + product.title + " " + product.price);
       }
        System.out.println();

    }







}
