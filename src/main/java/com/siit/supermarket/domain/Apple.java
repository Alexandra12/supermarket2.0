package com.siit.supermarket.domain;

import static com.siit.supermarket.utils.AppConstants.*;

public class Apple extends Product {

    public Apple(double quantity, String quality, double price) {
        super(FRUITS_CATEGORY, quantity, quality, KG, price);
    }
}
