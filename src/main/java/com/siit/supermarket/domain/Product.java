package com.siit.supermarket.domain;

public abstract class Product {

    private static int globalId = 0;

    private int id;
    private String category;
    private double price;
    private double quantity;
    private String quality;
    private String unitOfMeasure;

    public Product() {
    }

    public Product(String category, double quantity, String quality, String unitOfMeasure, double price) {
        this.id = globalId++;
        this.category = category;
        this.quantity = quantity;
        this.quality = quality;
        this.unitOfMeasure = unitOfMeasure;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", quantity=" + quantity +
                ", quality='" + quality + '\'' +
                ", unitOfMeasure='" + unitOfMeasure + '\'' +
                '}';
    }
}
