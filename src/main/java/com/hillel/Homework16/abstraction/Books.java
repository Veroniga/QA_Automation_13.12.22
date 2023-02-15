package com.hillel.Homework16.abstraction;

public abstract class Books {
    private String title;
    private int pages;
    private String bookSize;
    private String publisher;

    public Books(String title, int pages, String bookSize, String publisher) {
        this.title = title;
        this.pages = pages;
        this.bookSize = bookSize;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getBookSize() {
        return bookSize;
    }

    public void setBookSize(String bookSize) {
        this.bookSize = bookSize;
    }

    public static String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public abstract String getBookInfo();
}
