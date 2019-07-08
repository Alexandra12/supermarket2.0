package com.siit.supermarket.seller;

import com.siit.supermarket.domain.Product;

public class CoraSeller implements Supermarket {

    private static int idx = 0;
    private Product[] stock = new Product[10];

    public void addStock(Product product) {
        stock[idx++] = product;
    }

    public void deleteStock(int id, double quantity) {
//        for(int i =0; i<stock.length; i++) {
//            Product product = stock[i];
//        }

        for (Product product : stock) {
            if (product != null && product.getId() == id) {
                double crtQuantity = product.getQuantity();
                if (crtQuantity >= quantity) {
                    product.setQuantity(crtQuantity - quantity);
                } else {
                    product.setQuantity(0);
                }
            }
        }
    }

    public Product[] listProducts(String category) {
        Product[] result = new Product[10];
        int i = 0;
        for (Product product : stock) {
            if (product != null && product.getCategory().equals(category)) {
                result[i++] = product;
            }
        }
        return result;
    }

    public void listStock() {
        for (Product product : stock) {
            if (product != null) {
                System.out.println(product);
            }
        }
    }
}
