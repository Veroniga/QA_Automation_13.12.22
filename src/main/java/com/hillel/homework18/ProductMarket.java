package com.hillel.homework18;

import java.util.List;
import java.util.stream.Collectors;

public class ProductMarket {

    private List<Product> products;

    public ProductMarket(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<String> getProductName(){
        return products.stream()
                .map(p -> p.getName())
                .collect(Collectors.toList());
    }

    public List<String> getNameByAlphabet(){
        return products.stream()
                .map(p -> p.getName())
                .sorted()
                .collect(Collectors.toList());
    }

    public List<Product> getPriceMoreThan10(){
        return products.stream()
                .filter(p -> p.getPrice() > 10)
                .collect(Collectors.toList());
    }

    public List<Product> getPriceLessThan5(){
        return products.stream()
                .filter(p -> p.getPrice() < 5)
                .collect(Collectors.toList());
    }

    public String pricesString(){
        return products.stream()
                .map(p -> p.getPrice())
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}

