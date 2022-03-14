package fit.android.lab4.model;

import java.lang.reflect.Constructor;
import java.util.Formatter;

public class Product {
    private int id;
    private String nameProduct;
    private int numBuyer;
    private double price;
    private int discount;

    public Product(int id, String nameProduct, int numBuyer, double price, int discount) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.numBuyer = numBuyer;
        this.price = price;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getNumBuyer() {
        return numBuyer;
    }

    public void setNumBuyer(int numBuyer) {
        this.numBuyer = numBuyer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
