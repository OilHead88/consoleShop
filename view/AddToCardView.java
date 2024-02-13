package MyProject6OnlineShop.view;

import MyProject6OnlineShop.Data.service.ShopService;
import MyProject6OnlineShop.common.AppView;

import java.util.ArrayList;
import java.util.Scanner;

public class AddToCardView extends AppView {

    public AddToCardView(ShopService shopService) {
        super("Добавить товар", new ArrayList<>());

        this.shopService = shopService;
    }
    final ShopService shopService;


    @Override
    public void Action() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите id продукта");
        String productId = in.nextLine();
        if (productId==null)return;
        System.out.println("Введите количество");
        int count = in.nextInt();
        final boolean res = shopService.addToCart(productId,count);
        if (res){
            System.out.println("Товар добавлен");
        }else {
            System.out.println("Не удалось добавить товар");
        }
    }
}

