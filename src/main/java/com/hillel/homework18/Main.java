package com.hillel.homework18;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product Beverg = new Product("Water", 1);
        Product Beverg1 = new Product("Lemonad", 34);
        Product Beverg2 = new Product("Tea", 16);
        Product Beverg3 = new Product("Coffee", 25);

        List<Product> list = new ArrayList<>();
        list.add(Beverg);
        list.add(Beverg1);
        list.add(Beverg2);
        list.add(Beverg3);

        ProductMarket productMarket = new ProductMarket(list);

        productMarket.getProductName();
        productMarket.getNameByAlphabet();
        productMarket.getPriceMoreThan10();
        productMarket.getPriceLessThan5();
        productMarket.pricesString();
    }
}
