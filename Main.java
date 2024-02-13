package MyProject6OnlineShop;

import MyProject6OnlineShop.Data.data_source.cart.CartDataSource;
import MyProject6OnlineShop.Data.data_source.cart.MockCartDataSourceImpl;
import MyProject6OnlineShop.Data.data_source.catalog.CatalogDataSource;
import MyProject6OnlineShop.Data.data_source.catalog.MockCatalogDataSourceImpl;
import MyProject6OnlineShop.Data.data_source.order.MockOrderDataSourceImpl;
import MyProject6OnlineShop.Data.data_source.order.OrderDataSource;
import MyProject6OnlineShop.Data.service.ShopService;
import MyProject6OnlineShop.common.AppView;
import MyProject6OnlineShop.common.PageLoop;
import MyProject6OnlineShop.view.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CartDataSource cartDataSource = new MockCartDataSourceImpl();
        CatalogDataSource catalogDataSource = new MockCatalogDataSourceImpl();
        OrderDataSource orderDataSource = new MockOrderDataSourceImpl();
        ShopService shopService = new ShopService(catalogDataSource,cartDataSource,orderDataSource);
//        System.out.println(shopService.getCatalog());
//        System.out.println(shopService.getCart());
//        System.out.println(shopService.addToCart(shopService.getCatalog().get(0).id,5));
//        System.out.println(shopService.addToCart("67676",5));
//        System.out.println(shopService.getCart());
        AppView addToCardView = new AddToCardView(shopService);
        ArrayList<AppView>catalogChildren = new ArrayList<>();
        catalogChildren.add(addToCardView);
        AppView catalogView = new CatalogView(shopService,catalogChildren);
        AppView cartView = new CartView(shopService);
        AppView orderView = new OrderView(shopService);
        ArrayList<AppView>mainChildren = new ArrayList<>();
        mainChildren.add(catalogView);
        mainChildren.add(cartView);
        mainChildren.add(orderView);
        AppView mainView = new MainView(mainChildren);

        new PageLoop(mainView).run();






        }
    }
