package com.hillel.homework17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductMarket {
    private List<Product> products;
    public ProductMarket(List<Product> products) {
        this.products = products;
    }
    public List<String> getName(){
        List<String> name = new ArrayList<>();
        for(Product p : products){
            name.add(p.getName());
        }
        System.out.println(name);
        return name;
    }
    public List<String> getNameByAlphabet(){
        List<String> getNameByAlphabet = new ArrayList<>();
        for(Product p : products){
            getNameByAlphabet.add(p.getName());
        }
        Collections.sort(getNameByAlphabet);
        System.out.println(getNameByAlphabet);
        return getNameByAlphabet;
    }
//    Вернуть все цены больше 10
    public List<Integer> priceMoreThan10(){
        List<Integer> priceMoreThan10 = new ArrayList<>();
        for (Product p : products) {
            if (p.getPrice() > 10) {
                priceMoreThan10.add(p.getPrice());
            }
        }
        System.out.println(priceMoreThan10);
        return priceMoreThan10;
        }
    public List<Integer> priceLessThan5(){
        List<Integer> priceLessThan5 = new ArrayList<>();
        for (Product p : products) {
            if (p.getPrice() < 5) {
                priceLessThan5.add(p.getPrice());
            }
        }
        System.out.println(priceLessThan5);
        return priceLessThan5;
    }
    public List<String> pricesString(){
        List<String> pricesString = new ArrayList<>();
        for(Product p : products){
            pricesString.add(Integer.toString(p.getPrice()));
        }
        System.out.println(pricesString);
        return pricesString;
    }
}
