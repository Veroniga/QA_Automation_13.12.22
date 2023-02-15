package com.hillel.Homework16.products;

import com.hillel.Homework16.abstraction.Books;
import com.hillel.Homework16.interfaces.AudioVersion;

public class Fairytales extends Books implements AudioVersion {
    private int numberOfIllustrations;
    public Fairytales(String title, int pages, String bookSize, String publisher, int numberOfIllustrations) {
        super(title, pages, bookSize, publisher);
        this.numberOfIllustrations = numberOfIllustrations;
    }

    public int getNumberOfIllustrations() {
        return numberOfIllustrations;
    }

    public void setNumberOfIllustrations(int numberOfIllustrations) {
        this.numberOfIllustrations = numberOfIllustrations;
    }
    @Override
    public void audioVersion(){
        System.out.println("Audio version is available for all fairytales");
    }
    @Override
    public String getBookInfo(){
        return "Current Fairytale is published by " + getPublisher();
    }
    @Override
    public String toString(){
        return  getTitle() +
                " Fairytale has" + getPages() + "pages, " +
                getBookSize() + " format and contains " +
                numberOfIllustrations + " illustrations";
    }
}
