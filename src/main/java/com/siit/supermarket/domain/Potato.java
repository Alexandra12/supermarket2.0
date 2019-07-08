package com.siit.supermarket.domain;

import static com.siit.supermarket.utils.AppConstants.KG;
import static com.siit.supermarket.utils.AppConstants.VEGETABLES_CATEGORY;

public class Potato extends Product {

    public Potato(double quantity, String quality, double price) {

        super(VEGETABLES_CATEGORY, quantity, quality, KG, price);
    }
}
