package com.siit.supermarket.seller;

import com.siit.supermarket.domain.Product;

public interface Supermarket {

    void addStock(Product product);

    void deleteStock(int id, double quantity);

    Product[] listProducts(String category);

    void listStock();
}
