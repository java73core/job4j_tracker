package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int index) {
        for (int i = index; i < products.length; i++) {
       if (products.length - 1 > i) {
           products[i] = products[i + 1];
           products[i + 1] = null;
       } else {
           products[i] = null;
       }}
        return products;
    }
}