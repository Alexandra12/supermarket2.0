package com.siit.supermarket;

import com.siit.supermarket.client.Client;
import com.siit.supermarket.client.CoraClient;
import com.siit.supermarket.domain.Apple;
import com.siit.supermarket.domain.Banana;
import com.siit.supermarket.domain.Potato;
import com.siit.supermarket.domain.Product;
import com.siit.supermarket.seller.CoraSeller;
import com.siit.supermarket.seller.Supermarket;

import static com.siit.supermarket.utils.AppConstants.*;

public class Main {

    public static void main(String[] args) {
        // supermarket side
        Supermarket cora = new CoraSeller();

        Product apples = new Apple(500, MEDIUM_QUALITY, 5);
        Product bananas = new Banana(300, HIGH_QUALITY, 10);
        Product potatoes = new Potato(250, LOW_QUALITY, 2);

        cora.addStock(apples);
        cora.addStock(bananas);
        cora.addStock(potatoes);

        System.out.println("ALL PRODUCTS");
        cora.listStock();

        System.out.println();
        System.out.println("FRUITS");
        Product[] fruits = cora.listProducts(FRUITS_CATEGORY);
        for (Product fruit : fruits) {
            if (fruit != null) {
                System.out.println(fruit);
            }
        }

        // client side
        Client coraClient = new CoraClient();
        coraClient.addToCart(apples, 12);

        coraClient.checkout();
    }
}
