package com.siit.supermarket.client;

import com.siit.supermarket.domain.Product;

public interface Client {

    void addToCart(Product product, double quantity);

    void removeFromCart(int id);

    void checkout();
}
