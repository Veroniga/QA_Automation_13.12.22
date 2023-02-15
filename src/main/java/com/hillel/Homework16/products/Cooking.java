package com.hillel.Homework16.products;

import com.hillel.Homework16.abstraction.Books;

public final class Cooking extends Books {
    private String paperQuality;
    public Cooking(String title, int pages, String bookSize, String publisher, String paperQuality) {
        super(title, pages, bookSize, publisher);
        this.paperQuality = paperQuality;
    }

    public String getPaperQuality() {
        return paperQuality;
    }

    public void setPaperQuality(String paperQuality) {
        this.paperQuality = paperQuality;
    }

    @Override
    public String getBookInfo(){
        return "Current Cookbook is published by " + getPublisher();
    }
    @Override
    public String toString(){
        return  getTitle() +
                " Cookbook has" + getPages() + "pages, " +
                getBookSize() + " format and " +
                paperQuality + " paper quality";
    }


}
