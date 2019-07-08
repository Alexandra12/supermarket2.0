package com.siit.supermarket.domain;

import static com.siit.supermarket.utils.AppConstants.FRUITS_CATEGORY;
import static com.siit.supermarket.utils.AppConstants.KG;

public class Banana extends Product {

    public Banana( double quantity, String quality, double price) {

        super(FRUITS_CATEGORY, quantity, quality, KG, price);
    }
}
