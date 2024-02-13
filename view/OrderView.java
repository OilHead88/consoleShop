package MyProject6OnlineShop.view;

import MyProject6OnlineShop.Data.models.Product;
import MyProject6OnlineShop.Data.service.ShopService;
import MyProject6OnlineShop.common.AppView;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderView extends AppView {
    final ShopService shopService;


    public OrderView(ShopService shopService) {
        super("Оформление заказа", new ArrayList<>());
        this.shopService = shopService;
    }




    @Override
    public void Action() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите своё имя");
        String name = in.nextLine();
        System.out.println("Введите своё телефон");
        String phone = in.nextLine();


       shopService.createOrder(name,phone,"address","cash","утро 18-19 часов");
        System.out.println("Заказ оформлен");


    }







}
