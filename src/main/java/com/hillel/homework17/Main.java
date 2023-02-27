package com.hillel.homework17;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product Beverage = new Product("Water", 1);
        Product Beverage1 = new Product("Lemonad", 34);
        Product Beverage2 = new Product("Tea", 16);
        Product Beverage3 = new Product("Coffee", 25);

        ArrayList<Product> products = new ArrayList<>();
        products.add(Beverage);
        products.add(Beverage1);
        products.add(Beverage2);
        products.add(Beverage3);

        ProductMarket productMarket = new ProductMarket(products);

        productMarket.getName();
        productMarket.getNameByAlphabet();
        productMarket.pricesString();
        productMarket.priceMoreThan10();
        productMarket.priceLessThan5();
    }
}
