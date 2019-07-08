package com.siit.supermarket.domain;

public class Cart {

    private static int idx = 0;
    private ProductInCart[] products = new ProductInCart[10];

    public Cart() {
    }

    public void add(ProductInCart product) {
        products[idx++] = product;
    }

    public ProductInCart[] getProductsFromCart() {
        return products;
    }


    public static int getIdx() {
        return idx;
    }

    public static void setIdx(int idx) {
        Cart.idx = idx;
    }

    public ProductInCart[] getProducts() {
        return products;
    }

    public void setProducts(ProductInCart[] products) {
        this.products = products;
    }
}
