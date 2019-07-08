package com.siit.supermarket.client;

import com.siit.supermarket.domain.Cart;
import com.siit.supermarket.domain.Product;
import com.siit.supermarket.domain.ProductInCart;

public class CoraClient implements Client {

    private static final int MIN_ORDER = 50;

    private Cart cart;

    public CoraClient() {
        cart = new Cart();
    }

    public void addToCart(Product product, double quantiy) {
        ProductInCart productInCart = new ProductInCart(product, quantiy);
        cart.add(productInCart);
    }

    public void removeFromCart(int id) {
       //TODO
    }

    public void checkout() {
        double totalPrice = 0;
       for(ProductInCart productInCart: cart.getProductsFromCart()) {
           if(productInCart != null) {
               totalPrice += productInCart.getProduct().getPrice() * productInCart.getQuantity();
           }
       }

       if(totalPrice <= MIN_ORDER) {
           System.out.println("The min order is 50.");
       } else {
           // TODO
           // cart.reset();
       }
    }
}
